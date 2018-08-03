# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule SwaggerPetstore.Model.MixedPropertiesAndAdditionalPropertiesClass do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"uuid",
    :"dateTime",
    :"map"
  ]

  @type t :: %__MODULE__{
    :"uuid" => String.t | nil,
    :"dateTime" => DateTime.t | nil,
    :"map" => %{optional(String.t) => Animal} | nil
  }
end

defimpl Poison.Decoder, for: SwaggerPetstore.Model.MixedPropertiesAndAdditionalPropertiesClass do
  import SwaggerPetstore.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"map", :map, SwaggerPetstore.Model.Animal, options)
  end
end

