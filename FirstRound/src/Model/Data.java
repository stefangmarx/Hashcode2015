package Model;

import java.util.ArrayList;
import java.util.List;

public class Data {
	private int rows, slotsPerRow, unavailableSlots, pools, servers;
	private List<Server> serverList;
	private String [][] dataCenter;
	
	// Constructor.
	public Data(int rows, int slotsPerRow, int unavailableSlots, int pools, int servers) {
		this.rows = rows;
		this.slotsPerRow = slotsPerRow;
		this.unavailableSlots = unavailableSlots;
		this.pools = pools;
		this.servers = servers;
		this.serverList = new ArrayList<Server>();
		this.dataCenter = new String [rows][slotsPerRow];
	}
	
	public void showServerList() {
		for (Server server : this.serverList) {
			System.out.println("Id: " + server.getId() + " Density: " + server.getDensity() + " Slots: " + server.getSlots());
		}
	}
	
	// Getters and setters.
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getSlotsPerRow() {
		return slotsPerRow;
	}

	public void setSlotsPerRow(int slotsPerRow) {
		this.slotsPerRow = slotsPerRow;
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
	
	public List<Server> getServerList() {
		return this.serverList;
	}
	
	public String [][] getDataCenter() {
		return this.dataCenter;
	}
}
