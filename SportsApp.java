		package lab4;
		import java.util.Scanner;
		public class SportsApp {
		    public static void main(String[] args) {	      
		        player p1 = new player(101, "Ali", 10, "Forward");
		        player p2 = new player(102, "Ahmed", 7, "Midfielder");
		        player p3 = new player(103, "Sami", 4, "Defender");
		        player p4 = new player(104, "Fahad", 9, "Striker");
		        player p5 = new player(105, "Salem", 1, "Goalkeeper");
		        Team falcons = new Team("The Falcons", "Soccer", 25);
		        // 3. توقيع (إضافة) 3 لاعبين من الـ 5 للفريق
		        falcons.signPlayer(p1);
		        falcons.signPlayer(p2);
		        falcons.signPlayer(p3);

		        // 4. طلب رقم الفانلة من المستخدم والبحث عن اسم اللاعب
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter jersey number to search: ");
		        int searchNum = scanner.nextInt();

		        // استدعاء ميثود البحث وطباعة النتيجة
		        String result = falcons.findPlayersByNumber(searchNum);
		        System.out.println("Player Name: " + result);

		        scanner.close();
		    }
		}

	
