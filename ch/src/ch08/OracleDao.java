package ch08;

public class OracleDao implements DatAccessObject{
	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
}
