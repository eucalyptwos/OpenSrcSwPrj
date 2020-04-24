import java.util.Scanner;


public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		if(k==0)
			for(int j=1;j<=9;j++)
				for( int i=1; i<=9; i++)
					System.out.println(j+"*"+i+"="+j*i);
		else if(k>=0)
			for( int i=1; i<=9; i++)
				System.out.println(k+"*"+i+"="+k*i);
		else
			System.out.println("구구단을 출력할 수 없습니다.");
	}

}
