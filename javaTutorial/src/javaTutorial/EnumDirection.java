package javaTutorial;

public class EnumDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
enum Direction {
	East,West,north,South
}
Direction direction;
Direction direction1;
Direction direction2;
Direction direction3;
direction = Direction.East;
direction1 = Direction.West;
direction2 = Direction.north;
direction3 = Direction.South;
System.out.println(""+ direction);
System.out.println(""+ direction1);
System.out.println(""+ direction2);
System.out.println(""+ direction3);
	}

}
