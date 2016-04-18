package us.yellosoft.jacksonbooleans;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Patient {
  @JsonProperty
  private boolean smoker;
  @JsonProperty
  private Boolean living;

  public void setSmoker(boolean smoker) {
    this.smoker = smoker;
  }

  public void setLiving(Boolean living) {
    this.living = living;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return smoker == patient.smoker &&
            Objects.equals(living, patient.living);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smoker, living);
  }
}
