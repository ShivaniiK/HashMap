package com.HashMap;

	import java.util.HashMap;
	import java.util.Map;

	public class HashMapJava
	{
	public void getMapData()
	{
	HashMap<Integer, String> objmap = new HashMap<Integer, String>();
	objmap.put(1, "Shreya Ghoshal");
	objmap.put(2, "A R Rahman");
	objmap.put(3, "Arijit Singh");
	objmap.put(4, "Jubin Nautiyal");
	objmap.put(5, "Krishnakumar Kunnath");

	System.out.println("List of Indian Singers:");

	for(Map.Entry m : objmap.entrySet())
	{
	System.out.println(m.getKey()+" "+m.getValue());
	}
	    }

	}
