package Model;

public class Data {
	int rows, slots, unavailableSlots, pools, servers;
	
	// Constructor.
	public Data() {
		
	}

	// Getters and setters.
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}

	public int getUnavailableSlots() {
		return unavailableSlots;
	}

	public void setUnavailableSlots(int unavailableSlots) {
		this.unavailableSlots = unavailableSlots;
	}

	public int getPools() {
		return pools;
	}

	public void setPools(int pools) {
		this.pools = pools;
	}

	public int getServers() {
		return servers;
	}

	public void setServers(int servers) {
		this.servers = servers;
	}
}