# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule SwaggerPetstore.Model.Cat do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"className",
    :"color",
    :"declawed"
  ]

  @type t :: %__MODULE__{
    :"className" => String.t | nil,
    :"color" => String.t | nil,
    :"declawed" => boolean() | nil
  }
end

defimpl Poison.Decoder, for: SwaggerPetstore.Model.Cat do
  def decode(value, _options) do
    value
  end
end

