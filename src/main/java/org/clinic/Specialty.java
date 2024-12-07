package org.clinic;

public enum Specialty {
  ANESTHESIOLOGY("anestezjologia"),
  CARDIOLOGY("kardiologia"),
  DENTISTRY("stomatologia"),
  DERMATOLOGY("dermatologia"),
  GYNECOLOGY("ginekologia"),
  ONCOLOGY("onkologia"),
  ORTHOPEDICS("ordopedia"),
  PEDIATRICS("pediatria"),
  PSYCHIATRY("psychiatria"),
  RADIOLOGY("radiologia"),
  SURGERY("chirurgia"),
  UROLOGY("urologia");

  private final String name;

  Specialty(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
