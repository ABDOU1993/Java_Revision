package example4;

public abstract class Shape {
	
	private static int a;

	public static class Color {

		int m_red, m_green, m_blue;

		public Color() {
			this(0, 0, 0);
		}

		public Color(int m_red, int m_green, int m_blue) {
			this.m_red = m_red;
			this.m_green = m_green;
			this.m_blue = m_blue;
		}
		
		public int ff() {
			return a;
		}

		@Override
		public String toString() {
			return "Color [m_red=" + m_red + ", m_green=" + 
		m_green + ", m_blue=" + m_blue + "]";
		}

	}

}
