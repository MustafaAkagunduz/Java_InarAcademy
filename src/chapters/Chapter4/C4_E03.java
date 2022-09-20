package chapters.Chapter4;

public class C4_E03 {

	public static void main(String[] args) {
		
		double radius = 6371.01;
		
		double latATLANTA = 33.74;
		double longATLANTA = -84.38;
		double x1ATLANTA = Math.toRadians(latATLANTA);
		double y1ATLANTA = Math.toRadians(longATLANTA);

		double latORLANDO = 28.53;
		double longORLANDO = -81.37;
		double x2ORLANDO = Math.toRadians(latORLANDO);
		double y2ORLANDO = Math.toRadians(longORLANDO);

		double latSAVANNAH = 32.08;
		double longSAVANNAH = -81.09;
		double x3SAVANNAH = Math.toRadians(latSAVANNAH);
		double y3SAVANNAH = Math.toRadians(longSAVANNAH);

		double latCHARLOTTE = 35.21;
		double longCHARLOTTE = -80.94;
		double x4CHARLOTTE = Math.toRadians(latCHARLOTTE);
		double y4CHARLOTTE = Math.toRadians(longCHARLOTTE);

		
		double s1 = radius * Math.acos(Math.sin(x1ATLANTA) * Math.sin(x2ORLANDO) + Math.cos(x1ATLANTA) * Math.cos(x2ORLANDO) * Math.cos(y1ATLANTA - y2ORLANDO));
		double s2 = radius * Math.acos(Math.sin(x2ORLANDO) * Math.sin(x3SAVANNAH) + Math.cos(x2ORLANDO) * Math.cos(x3SAVANNAH) * Math.cos(y2ORLANDO - y3SAVANNAH));
		double s3 = radius * Math.acos(Math.sin(x3SAVANNAH) * Math.sin(x4CHARLOTTE) + Math.cos(x3SAVANNAH) * Math.cos(x4CHARLOTTE) * Math.cos(y3SAVANNAH - y4CHARLOTTE));
		double s4 = radius * Math.acos(Math.sin(x4CHARLOTTE) * Math.sin(x1ATLANTA) + Math.cos(x4CHARLOTTE) * Math.cos(x1ATLANTA) * Math.cos(y4CHARLOTTE - y1ATLANTA));
		double s5 = radius * Math.acos(Math.sin(x3SAVANNAH) * Math.sin(x1ATLANTA) + Math.cos(x3SAVANNAH) * Math.cos(x1ATLANTA) * Math.cos(y3SAVANNAH - y1ATLANTA));
				

		double tr1 = (s1 + s2 + s5) / 2;
		double area1 = Math.pow((tr1 * (tr1 - s1) * (tr1 - s2) * (tr1 - s5)), 0.5);
		area1 = (int) (area1 * 100) / 100.0;

		double tr2 = (s5 + s3 + s4) / 2;
		double area2 = Math.pow((tr2 * (tr2 - s5) * (tr2 - s3) * (tr2 - s4)), 0.5);
		area2 = (int) (area2 * 100) / 100.0;

		System.out.println("The area is:  " + area1 + area2);

	}

}
