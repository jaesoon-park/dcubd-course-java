package ch08;

public class MySqlDao implements DatAccessObject{
	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
	}
	@Override
	public void update() {
		System.out.println("MySql DB�� ����");
	}
	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
}
