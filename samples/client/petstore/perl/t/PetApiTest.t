#
# Copyright 2016 SmartBear Software
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
#
# NOTE: This class is auto generated by Swagger Codegen
# Please update the test case below to test the API endpoints.
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::SwaggerClient::PetApi');

my $api = WWW::SwaggerClient::PetApi->new();
isa_ok($api, 'WWW::SwaggerClient::PetApi');

#
# add_pet test
#
{
    my $body = undef; # replace NULL with a proper value
    my $result = $api->add_pet(body => $body);
}

#
# delete_pet test
#
{
    my $pet_id = undef; # replace NULL with a proper value
    my $api_key = undef; # replace NULL with a proper value
    my $result = $api->delete_pet(pet_id => $pet_id, api_key => $api_key);
}

#
# find_pets_by_status test
#
{
    my $status = undef; # replace NULL with a proper value
    my $result = $api->find_pets_by_status(status => $status);
}

#
# find_pets_by_tags test
#
{
    my $tags = undef; # replace NULL with a proper value
    my $result = $api->find_pets_by_tags(tags => $tags);
}

#
# get_pet_by_id test
#
{
    my $pet_id = undef; # replace NULL with a proper value
    my $result = $api->get_pet_by_id(pet_id => $pet_id);
}

#
# update_pet test
#
{
    my $body = undef; # replace NULL with a proper value
    my $result = $api->update_pet(body => $body);
}

#
# update_pet_with_form test
#
{
    my $pet_id = undef; # replace NULL with a proper value
    my $name = undef; # replace NULL with a proper value
    my $status = undef; # replace NULL with a proper value
    my $result = $api->update_pet_with_form(pet_id => $pet_id, name => $name, status => $status);
}

#
# upload_file test
#
{
    my $pet_id = undef; # replace NULL with a proper value
    my $additional_metadata = undef; # replace NULL with a proper value
    my $file = undef; # replace NULL with a proper value
    my $result = $api->upload_file(pet_id => $pet_id, additional_metadata => $additional_metadata, file => $file);
}


1;
