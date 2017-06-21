package com.boot.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.boot.model.Shipwreck;

public class ShipwreckStub {
		private static Map<Long, Shipwreck> wrecks = new HashMap<Long, Shipwreck>();
		private static Long idIndex = 3L;
		
		static {
			Shipwreck a = new Shipwreck(1L, "U869", "First german boat ", "FAIR", 200, 44.12, 138.44, 1994);
			wrecks.put(1L, a);
			Shipwreck b = new Shipwreck(2L, "Secondaryian", "British tea boat", "GOOD", 80, 44.12, 138.44, 1994);
			wrecks.put(2L, b);
			Shipwreck c = new Shipwreck(3L, "Titanic", "Big mistake", "FAIR", 50, 44.12, 138.44, 1994);
			wrecks.put(3L, c);
		}
		public static List<Shipwreck> list(){
			return new ArrayList<Shipwreck>(wrecks.values());
		}
		
		public static Shipwreck create(Shipwreck wreck){
			idIndex += idIndex;
			wreck.setId(idIndex);
			wrecks.put(idIndex, wreck);
			return wreck;
		}
		public static Shipwreck get(Long id ){
			return wrecks.get(id);
		}
		public static Shipwreck update(Long id, Shipwreck wreck){
			wrecks.put(id,  wreck);
			return wreck;
		}
		public static Shipwreck delete(Long id){
			return wrecks.remove(id);
		}
 

	
}
