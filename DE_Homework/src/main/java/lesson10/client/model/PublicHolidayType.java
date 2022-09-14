/*
 * Nager.Date API - V3
 * Nager.Date is open source software and is completely free for commercial use. If you would like to support the project you can award a GitHub star ⭐ or even better <a href='https://github.com/sponsors/nager'>actively support us</a>
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package lesson10.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets PublicHolidayType
 */
@JsonAdapter(PublicHolidayType.Adapter.class)
public enum PublicHolidayType {
  PUBLIC("Public"),
  BANK("Bank"),
  SCHOOL("School"),
  AUTHORITIES("Authorities"),
  OPTIONAL("Optional"),
  OBSERVANCE("Observance");

  private String value;

  PublicHolidayType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PublicHolidayType fromValue(String input) {
    for (PublicHolidayType b : PublicHolidayType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PublicHolidayType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PublicHolidayType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PublicHolidayType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PublicHolidayType.fromValue((String)(value));
    }
  }
}