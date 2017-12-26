-module(petstore_user_api).

-export([create_user/2, create_user/3,
         create_users_with_array_input/2, create_users_with_array_input/3,
         create_users_with_list_input/2, create_users_with_list_input/3,
         delete_user/2, delete_user/3,
         get_user_by_name/2, get_user_by_name/3,
         login_user/3, login_user/4,
         logout_user/1, logout_user/2,
         update_user/3, update_user/4]).

-define(BASE_URL, <<"/v2">>).

%% @doc Create user
%% This can only be done by the logged in user.
-spec create_user(ctx:ctx(), petstore_user:petstore_user()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
create_user(Ctx, Body) ->
    create_user(Ctx, Body, #{}).

-spec create_user(ctx:ctx(), petstore_user:petstore_user(), maps:map()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
create_user(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),

    Method = post,
    Path = ["/user"],
    QS = [],
    Headers = [],
    Body1 = Body,
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, [?BASE_URL, Path], QS, Headers, Body1, Opts).

%% @doc Creates list of users with given input array
-spec create_users_with_array_input(ctx:ctx(), list()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
create_users_with_array_input(Ctx, Body) ->
    create_users_with_array_input(Ctx, Body, #{}).

-spec create_users_with_array_input(ctx:ctx(), list(), maps:map()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
create_users_with_array_input(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),

    Method = post,
    Path = ["/user/createWithArray"],
    QS = [],
    Headers = [],
    Body1 = Body,
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, [?BASE_URL, Path], QS, Headers, Body1, Opts).

%% @doc Creates list of users with given input array
-spec create_users_with_list_input(ctx:ctx(), list()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
create_users_with_list_input(Ctx, Body) ->
    create_users_with_list_input(Ctx, Body, #{}).

-spec create_users_with_list_input(ctx:ctx(), list(), maps:map()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
create_users_with_list_input(Ctx, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),

    Method = post,
    Path = ["/user/createWithList"],
    QS = [],
    Headers = [],
    Body1 = Body,
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, [?BASE_URL, Path], QS, Headers, Body1, Opts).

%% @doc Delete user
%% This can only be done by the logged in user.
-spec delete_user(ctx:ctx(), binary()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
delete_user(Ctx, Username) ->
    delete_user(Ctx, Username, #{}).

-spec delete_user(ctx:ctx(), binary(), maps:map()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
delete_user(Ctx, Username, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),

    Method = delete,
    Path = ["/user/", Username, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, [?BASE_URL, Path], QS, Headers, Body1, Opts).

%% @doc Get user by user name
-spec get_user_by_name(ctx:ctx(), binary()) -> {ok, petstore_user:petstore_user(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
get_user_by_name(Ctx, Username) ->
    get_user_by_name(Ctx, Username, #{}).

-spec get_user_by_name(ctx:ctx(), binary(), maps:map()) -> {ok, petstore_user:petstore_user(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
get_user_by_name(Ctx, Username, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),

    Method = get,
    Path = ["/user/", Username, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, [?BASE_URL, Path], QS, Headers, Body1, Opts).

%% @doc Logs user into the system
-spec login_user(ctx:ctx(), binary(), binary()) -> {ok, binary(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
login_user(Ctx, Username, Password) ->
    login_user(Ctx, Username, Password, #{}).

-spec login_user(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, binary(), petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
login_user(Ctx, Username, Password, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),

    Method = get,
    Path = ["/user/login"],
    QS = lists:flatten([{<<"username">>, Username}, {<<"password">>, Password}])++petstore_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, [?BASE_URL, Path], QS, Headers, Body1, Opts).

%% @doc Logs out current logged in user session
-spec logout_user(ctx:ctx()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
logout_user(Ctx) ->
    logout_user(Ctx, #{}).

-spec logout_user(ctx:ctx(), maps:map()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
logout_user(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),

    Method = get,
    Path = ["/user/logout"],
    QS = [],
    Headers = [],
    Body1 = [],
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, [?BASE_URL, Path], QS, Headers, Body1, Opts).

%% @doc Updated user
%% This can only be done by the logged in user.
-spec update_user(ctx:ctx(), binary(), petstore_user:petstore_user()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
update_user(Ctx, Username, Body) ->
    update_user(Ctx, Username, Body, #{}).

-spec update_user(ctx:ctx(), binary(), petstore_user:petstore_user(), maps:map()) -> {ok, [], petstore_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), petstore_utils:response_info()}.
update_user(Ctx, Username, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),

    Method = put,
    Path = ["/user/", Username, ""],
    QS = [],
    Headers = [],
    Body1 = Body,
    Opts = maps:get(hackney_opts, Optional, []),

    petstore_utils:request(Ctx, Method, [?BASE_URL, Path], QS, Headers, Body1, Opts).


