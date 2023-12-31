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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;
/**
 * Long Weekend
 */
@Schema(description = "Long Weekend")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-09T09:45:58.094Z[GMT]")
public class LongWeekendV3Dto {
  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("dayCount")
  private Integer dayCount = null;

  @SerializedName("needBridgeDay")
  private Boolean needBridgeDay = null;

  public LongWeekendV3Dto startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * StartDate
   * @return startDate
  **/
  @Schema(description = "StartDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public LongWeekendV3Dto endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * EndDate
   * @return endDate
  **/
  @Schema(description = "EndDate")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public LongWeekendV3Dto dayCount(Integer dayCount) {
    this.dayCount = dayCount;
    return this;
  }

   /**
   * DayCount
   * @return dayCount
  **/
  @Schema(description = "DayCount")
  public Integer getDayCount() {
    return dayCount;
  }

  public void setDayCount(Integer dayCount) {
    this.dayCount = dayCount;
  }

  public LongWeekendV3Dto needBridgeDay(Boolean needBridgeDay) {
    this.needBridgeDay = needBridgeDay;
    return this;
  }

   /**
   * NeedBridgeDay
   * @return needBridgeDay
  **/
  @Schema(description = "NeedBridgeDay")
  public Boolean isNeedBridgeDay() {
    return needBridgeDay;
  }

  public void setNeedBridgeDay(Boolean needBridgeDay) {
    this.needBridgeDay = needBridgeDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongWeekendV3Dto longWeekendV3Dto = (LongWeekendV3Dto) o;
    return Objects.equals(this.startDate, longWeekendV3Dto.startDate) &&
        Objects.equals(this.endDate, longWeekendV3Dto.endDate) &&
        Objects.equals(this.dayCount, longWeekendV3Dto.dayCount) &&
        Objects.equals(this.needBridgeDay, longWeekendV3Dto.needBridgeDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, dayCount, needBridgeDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongWeekendV3Dto {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    dayCount: ").append(toIndentedString(dayCount)).append("\n");
    sb.append("    needBridgeDay: ").append(toIndentedString(needBridgeDay)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
