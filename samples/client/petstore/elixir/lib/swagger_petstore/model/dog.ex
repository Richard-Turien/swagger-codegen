# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule SwaggerPetstore.Model.Dog do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"className",
    :"color",
    :"breed"
  ]

  @type t :: %__MODULE__{
    :"className" => String.t | nil,
    :"color" => String.t | nil,
    :"breed" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SwaggerPetstore.Model.Dog do
  def decode(value, _options) do
    value
  end
end

