public class FindGuitar {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar betty = new Guitar("", 0, "fender", "Stratocastor", Type.ASCOUTIC, "Alder", "Alder");
		Guitar res = inventory.search(betty);
		if (res != null) {
			System.out.println("1");
		} else {
			System.out.println("0");

		}
	}

	/**
	 * Initial based Inventory to test data.
	 * 
	 * @param inventory
	 */
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, "Collings", "CJ", Type.ASCOUTIC,
				"Indian Rosewood", "Sitka");
		inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", Type.ELECTRIC,
				"Alder", "Alder");
		inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", Type.ELECTRIC,
				"Alder", "Alder");
		inventory.addGuitar("122784", 5495.95, "Martin", "D-18", Type.ASCOUTIC,
				"Mahogany", "Adirondack");
		inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", Type.ASCOUTIC,
				"Brazilian Rosewood", "Adriondack");
		inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", Type.ELECTRIC,
				"Mahogany", "Maple");
		inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue",
				Type.ELECTRIC, "Mahogany", "Mahogany");
		inventory.addGuitar("77023", 6275.95, "Martin", "D-28", Type.ASCOUTIC,
				"Brazilian Rosewood", "Adirondack");
		inventory.addGuitar("1092", 12995.95, "Olson", "SJ", Type.ASCOUTIC,
				"Indian Rosewood", "Cedar");
		inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", Type.ASCOUTIC,
				"Cocobolo", "Cedar");
		inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature",
				Type.ELECTRIC, "Mahogany", "Maple");
	}

}
