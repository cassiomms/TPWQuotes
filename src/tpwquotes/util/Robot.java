package tpwquotes.util;

import java.net.*; // acesso a rede TCP/IP
import java.io.*;  // streams

public class Robot {

	public static String get(String path) throws Exception {
		String buffer = "";
		URL url = new URL(path);
		URLConnection uconn = url.openConnection();
		InputStream is = uconn.getInputStream();

		// Scanner DataInputStream BufferedReader
		BufferedReader br = new BufferedReader(
					new InputStreamReader(
						is
					)
				);
		String str = null;
		while ((str = br.readLine()) != null) {
			buffer += str+'\n';
		}

		return buffer;
	}

	// Teste de unidade
	public static void main(String args[]) throws Exception {
		String str = Robot.get("http://ichart.finance.yahoo.com/table.csv?s=MSFT&a=05&b=22&c=2011&d=05&e=27&f=2011&g=d&ignore=.csv");
		System.out.println(str);
	}
}

