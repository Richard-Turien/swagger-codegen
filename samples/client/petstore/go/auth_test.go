package main

import (
	"golang.org/x/net/context"
	"net/http"
	"net/http/httputil"
	"strings"
	"testing"
	"time"

	"golang.org/x/oauth2"

	sw "./go-petstore"
)

func TestOAuth2(t *testing.T) {
	// Setup some fake oauth2 configuration
	cfg := &oauth2.Config{
		ClientID:     "1234567",
		ClientSecret: "SuperSecret",
		Endpoint: oauth2.Endpoint{
			AuthURL:  "https://devnull",
			TokenURL: "https://devnull",
		},
		RedirectURL: "https://devnull",
	}

	// and a fake token
	tok := oauth2.Token{
		AccessToken:  "FAKE",
		RefreshToken: "So Fake",
		Expiry:       time.Now().Add(time.Hour * 100000),
		TokenType:    "Bearer",
	}

	// then a fake tokenSource
	tokenSource := cfg.TokenSource(createContext(nil), &tok)
	auth := context.WithValue(oauth2.NoContext, sw.ContextOAuth2, tokenSource)

	newPet := (sw.Pet{Id: 12992, Name: "gopher",
		PhotoUrls: []string{"http://1.com", "http://2.com"}, Status: "pending", Tags: []sw.Tag{sw.Tag{Id: 1, Name: "tag2"}}})

	r, err := client.PetApi.AddPet(nil, newPet)

	if err != nil {
		t.Errorf("Error while adding pet")
		t.Log(err)
	}
	if r.StatusCode != 200 {
		t.Log(r)
	}

	r, err = client.PetApi.DeletePet(auth, 12992, nil)

	if err != nil {
		t.Errorf("Error while deleting pet by id")
		t.Log(err)
	}
	if r.StatusCode != 200 {
		t.Log(r)
	}
	reqb, err := httputil.DumpRequest(r.Request, true)

	if !strings.Contains((string)(reqb), "Authorization: Bearer FAKE") {
		t.Errorf("OAuth2 Authentication is missing")
	}
}

func TestBasicAuth(t *testing.T) {

	auth := context.WithValue(oauth2.NoContext, sw.ContextBasicAuth, sw.BasicAuth{
		UserName: "fakeUser",
		Password: "f4k3p455",
	})

	newPet := (sw.Pet{Id: 12992, Name: "gopher",
		PhotoUrls: []string{"http://1.com", "http://2.com"}, Status: "pending", Tags: []sw.Tag{sw.Tag{Id: 1, Name: "tag2"}}})

	r, err := client.PetApi.AddPet(auth, newPet)

	if err != nil {
		t.Errorf("Error while adding pet")
		t.Log(err)
	}
	if r.StatusCode != 200 {
		t.Log(r)
	}

	r, err = client.PetApi.DeletePet(auth, 12992, nil)

	if err != nil {
		t.Errorf("Error while deleting pet by id")
		t.Log(err)
	}
	if r.StatusCode != 200 {
		t.Log(r)
	}
	reqb, err := httputil.DumpRequest(r.Request, true)
	if !strings.Contains((string)(reqb), "Authorization: Basic ZmFrZVVzZXI6ZjRrM3A0NTU") {
		t.Errorf("Basic Authentication is missing")
	}
}

func TestAccessToken(t *testing.T) {
	auth := context.WithValue(oauth2.NoContext, sw.ContextAccessToken, "TESTFAKEACCESSTOKENISFAKE")

	newPet := (sw.Pet{Id: 12992, Name: "gopher",
		PhotoUrls: []string{"http://1.com", "http://2.com"}, Status: "pending", Tags: []sw.Tag{sw.Tag{Id: 1, Name: "tag2"}}})

	r, err := client.PetApi.AddPet(nil, newPet)

	if err != nil {
		t.Errorf("Error while adding pet")
		t.Log(err)
	}
	if r.StatusCode != 200 {
		t.Log(r)
	}

	r, err = client.PetApi.DeletePet(auth, 12992, nil)

	if err != nil {
		t.Errorf("Error while deleting pet by id")
		t.Log(err)
	}
	if r.StatusCode != 200 {
		t.Log(r)
	}
	reqb, err := httputil.DumpRequest(r.Request, true)
	if !strings.Contains((string)(reqb), "Authorization: Bearer TESTFAKEACCESSTOKENISFAKE") {
		t.Errorf("AccessToken Authentication is missing")
	}
}

func TestDefaultHeader(t *testing.T) {

	newPet := (sw.Pet{Id: 12992, Name: "gopher",
		PhotoUrls: []string{"http://1.com", "http://2.com"}, Status: "pending", Tags: []sw.Tag{sw.Tag{Id: 1, Name: "tag2"}}})

	r, err := client.PetApi.AddPet(nil, newPet)

	if err != nil {
		t.Errorf("Error while adding pet")
		t.Log(err)
	}
	if r.StatusCode != 200 {
		t.Log(r)
	}

	r, err = client.PetApi.DeletePet(nil, 12992, nil)

	if err != nil {
		t.Errorf("Error while deleting pet by id")
		t.Log(err)
	}
	if r.StatusCode != 200 {
		t.Log(r)
	}
	reqb, err := httputil.DumpRequest(r.Request, true)
	if !strings.Contains((string)(reqb), "Testheader: testvalue") {
		t.Errorf("Default Header is missing")
	}
}

// Add custom clients to the context.
func createContext(httpClient *http.Client) context.Context {
	parent := oauth2.NoContext
	ctx := context.WithValue(parent, oauth2.HTTPClient, httpClient)
	return ctx
}
