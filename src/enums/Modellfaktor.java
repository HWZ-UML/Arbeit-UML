package enums;


	private enum modellfaktor {
		Toyota,
		Audi,
		Mercedes;
		
		public int faktor() {
			return ordinal() +1; // Standartm�ssig hat 1. Enum Wert 0, 2. Wert 1, ...
		}
		}

