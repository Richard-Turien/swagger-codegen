@ECHO OFF
set executable=.\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar

If Not Exist %executable% (
  mvn clean package
)

REM set JAVA_OPTS=%JAVA_OPTS% -Xmx1024M

echo Typescript-Fetch Petstore API client (NPM version)
set ags=generate -i modules\swagger-codegen\src\test\resources\2_0\swagger.json -l typescript-fetch -c bin/typescript-fetch-petstore-npm.json -o samples\client\petstore\typescript-fetch\tsoa

java %JAVA_OPTS% -jar %executable% %ags%
