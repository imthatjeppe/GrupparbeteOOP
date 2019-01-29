
public interface Movable {

		/**
		 * �ndrar bilens x & y koordinater beroende p� dess riktning och speed
		 */
		void move();
		
		/**
		 * �ndrar p� bilens riktning negativt i intervallet 1 till 4
		 */
		void turnleft();
		
		/**
		 * �ndrar p� bilens riktning positivt i intervallet 1 till 4
		 */
		void turnright();
}
