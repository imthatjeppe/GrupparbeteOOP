
public interface Movable {

		/**
		 * Ändrar bilens x & y koordinater beroende på dess riktning och speed
		 */
		void move();
		
		/**
		 * Ändrar på bilens riktning negativt i intervallet 1 till 4
		 */
		void turnleft();
		
		/**
		 * Ändrar på bilens riktning positivt i intervallet 1 till 4
		 */
		void turnright();
}
