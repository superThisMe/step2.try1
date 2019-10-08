package step2;

public interface Manager {
	/**
	 * <pre>
	 * 새로운 Human 객체를 등록한다.
	 * 등록된 Human 객체 정보 중 주민번호는 중복될 수 없으며, 이미 등록된 주민번호의 Human 정보는 등록할 수 없다.
	 * </pre>
	 * @param human 등록할 Professor, Trainee, Staff 클래스의 객체
	 * @return 등록 성공 시 true를, 실패(이미 등록된 주민번호 중복 등록) 시 false를 반환한다.
	 * */
	public boolean insertHuman(Human human);

	/**
	 * 등록된 Human 객체를 검색한다.
	 * @param jumin 검색할 Human의 주민번호
	 * @return Human ArrayList에 등록된 객체들 중 파라메터로 전달된 주민번호와 일치되는 Human 객체, 검색 결과가 없을 시 null을 반환한다.
	 * */
	public Human findHuman(String jumin);

	/**
	 * 등록된 Human 객체를 삭제한다.
	 * @param jumin 삭제할 Human의 주민번호
	 * @return 주어진 주민번호와 일치되는 Human 객체의 삭제 결과, ArrayList에 등록된 객체들 중 파라메터로 전달된 주민번호와 일치되는 Human 객체가 발견되어 삭제를 성공하면 true를 그렇지 않으면 false를 반환
	 * */
	public boolean deleteHuman(String jumin);
	
	/**
	 * 등록된 모든 Human 객체 정보를 출력한다.
	 * */
	public void showAll();
}
