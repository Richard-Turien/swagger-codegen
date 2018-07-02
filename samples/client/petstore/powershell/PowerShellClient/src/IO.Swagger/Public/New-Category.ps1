<#
.Synopsis
    Creates new IO.Swagger.Model.Category object.

.Description
    Creates new IO.Swagger.Model.Category object.

.Parameter Id
    ID.

.Parameter Name
    Name

.Example
    New-Category -Id 1 -Name 'foo'

.Inputs
    System.Nullable[long]

    System.String

.Outputs
    IO.Swagger.Model.Category

.Notes
    This function is automatically generated by the Swagger Codegen.

.Link
    https://github.com/swagger-api/swagger-codegen
#>
function New-Category {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[long]]
        ${Id},

        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [string]
        ${Name}
    )

    Process {
        'Creating object: IO.Swagger.Model.Category' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName IO.Swagger.Model.Category -ArgumentList @(
            ${Id},
            ${Name}
        )
    }
}