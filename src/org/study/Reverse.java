package org.study;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Reverse {
	public static void main(String[] args) {
		//		int n = 7987074;
		//		int rev = 0;
		//		for(int i=1;i<=n;) {
		//			rev = rev*10+n%10;
		//			n=n/10;
		//		}
		//		System.out.println(rev);
		//	}

		int n = 123456;
		int rev = 0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
} 