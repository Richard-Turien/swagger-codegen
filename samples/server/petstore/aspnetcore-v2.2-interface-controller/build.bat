:: Generated by: https://github.com/swagger-api/swagger-codegen.git
::

@echo off

dotnet restore src\IO.Swagger
dotnet build src\IO.Swagger
echo Now, run the following to start the project: dotnet run -p src\IO.Swagger\IO.Swagger.csproj --launch-profile web.
echo.
