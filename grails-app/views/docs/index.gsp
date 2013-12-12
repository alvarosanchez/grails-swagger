<!DOCTYPE html>
<html>
<head>
    <title>API Documentation</title>
    <link href='//fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'/>
    <r:require module="swagger"/>
    <r:layoutResources />
    <r:script>
        $(function () {
            window.swaggerUi = new SwaggerUi({
                url: '${request.contextPath}/api-docs/',
                dom_id: "swagger-ui-container",
                supportedSubmitMethods: ['get', 'post', 'put', 'delete'],
                onComplete: function(swaggerApi, swaggerUi){
                    if(console) {
                        console.log("Loaded SwaggerUI")
                    }
                    $('pre code').each(function(i, e) {hljs.highlightBlock(e)});
                },
                onFailure: function(data) {
                    if(console) {
                        console.log("Unable to Load SwaggerUI");
                        console.log(data);
                    }
                },
                docExpansion: "none"
            });

            $('#input_apiKey').change(function() {
                var key = $('#input_apiKey')[0].value;
                console.log("key: " + key);
                if(key && key.trim() != "") {
                    console.log("added key " + key);
                    window.authorizations.add("key", new ApiKeyAuthorization("api_key", key, "query"));
                }
            })
            window.swaggerUi.load();
        });
    </r:script>
</head>

<body>

<div id='header'>
    <div class="swagger-ui-wrap">
        <a id="logo" href="http://swagger.wordnik.com">swagger</a>

        <form id='api_selector'>
            <div class='input icon-btn'>
                <img id="show-pet-store-icon" src="${resource(file: 'images/pet_store_api.png', plugin: 'swagger')}" title="Show Swagger Petstore Example Apis">
            </div>
            <div class='input icon-btn'>
                <img id="show-wordnik-dev-icon" src="${resource(file: 'images/wordnik_api.png', plugin: 'swagger')}" title="Show Wordnik Developer Apis">
            </div>
            <div class='input'><input placeholder="http://example.com/api" id="input_baseUrl" name="baseUrl" type="text"/></div>
            <div class='input'><input placeholder="api_key" id="input_apiKey" name="apiKey" type="text"/></div>
            <div class='input'><a id="explore" href="#">Explore</a></div>
        </form>
    </div>
</div>

<div id="message-bar" class="swagger-ui-wrap">
    &nbsp;
</div>

<div id="swagger-ui-container" class="swagger-ui-wrap">

</div>

<r:layoutResources />
</body>

</html>