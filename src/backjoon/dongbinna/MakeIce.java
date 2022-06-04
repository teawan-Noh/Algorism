package backjoon.dongbinna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeIce {

	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	public static boolean dfs(int x, int y) {
		// 주어진 범위를 벗어나는 경우에는 즉시 종료
		if(x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}

		// 현재 노드를 아직 방문하지 않았다면
		if(graph[x][y] == 0) {
			// 해당 노드 방문 처리
			graph[x][y] = 1;
			
			// 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
			dfs(x-1, y);
			dfs(x+1, y);
			dfs(x, y-1);
			dfs(x, y+1);
			return true;
		}
		
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine(); //String
//		int i = Integer.parseInt(br.readLine()); //Int
		
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		System.out.println(n +", "+ m);
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0'; // 아스키코드로 출력 안되도록 - '0'
			}
		}
		
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(dfs(i,j)) {
					result += 1;
				}
			}
		}
		System.out.println(result);
	}

}
