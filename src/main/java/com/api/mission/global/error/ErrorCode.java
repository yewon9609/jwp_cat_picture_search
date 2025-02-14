package com.api.mission.global.error;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

  CANNOT_LOAD_DATER(HttpStatus.BAD_REQUEST, "api-api에서 데이터를 불러오는데 실패하였습니다"),
  CAT_IMAGE_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 고양이 이미지를 찾을 수 없습니다");

  private final HttpStatus httpStatus;
  private final String message;

  ErrorCode(HttpStatus httpStatus, String message) {
    this.httpStatus = httpStatus;
    this.message = message;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public String getMessage() {
    return message;
  }
}
