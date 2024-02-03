package boardProject.boardException;

public enum ErrorCode implements EnumModel{
  BOARD_NO_INFORMATION (404, "게시물 목록에 존재하지 않는 정보입니다.", "N001"),
  INVALID_INPUT_SELECT(400, "유효하지 않는 메뉴 선택입니다.", "S001");

  private  int status;
  private  String code;
  private  String message;
  ErrorCode(int status, String message, String code) {
    // 위에 상수문에 의해 생성자로 객체생성
    this.status = status;
    this.message =message;
    this.code = code;
  }

  @Override
  public String getMessage() {
    return this.message;
  }

  @Override
  public String getCode() {
    return this.code;
  }

  public int getStatus(){
    return  this.status;
  }
}

