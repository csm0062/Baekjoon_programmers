import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) {
	
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
			
			int snack = Integer.parseInt(st.nextToken());
			int howmany = Integer.parseInt(st.nextToken());
			int money = Integer.parseInt(st.nextToken());
			
			if((snack * howmany) >= money) {
				System.out.println((snack * howmany) - money);
			} else {
				System.out.println(0);
			}

		} catch (IOException ie) {
            ie.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("잘못된 입력 형식입니다.");
        } catch (Exception e) {
            System.out.println("예상치 못한 오류: " + e.getMessage());
        }
		
	}

}
