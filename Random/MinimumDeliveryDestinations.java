// Minimum delivery destinations

class MinimumDeliveryDestinations {
	Map<List<Integer>, Double> map = new HashMap<>();
	for(int i=0;i<allLocations.size();i++){
		List<Integer> list = allLocations.get(i);
		int valOne = list.get(0);
		int valTwo = list.get(1);
		int val = (valOne*valOne) + (valTwo*valTwo);
		double sqrt = Math.sqrt(val);
		map.put(list,sqrt);
	}
	Map<List<Integer>, Double> finalMap = map
	.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue())
	.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (v1,v2) -> v2, LinkedHashMap::new));
	
	List<List<Integer>> finalList = new ArrayList<>();
	int count = 0;
	for(List<Integer> l: finalMap.keySet()){
		if(count<numDeliveries){
			finalList.add(l);
			count++;
		}
		else{
			break;
		}
	}
	return finalList;
}