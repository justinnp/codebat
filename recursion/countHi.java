// Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
//
//
// countHi("xxhixx") → 1
// countHi("xhixhix") → 2
// countHi("hi") → 1

public int countHi(String str) {
  if(str.length() <= 1) return 0;
  return (str.charAt(0) == 'h' && str.charAt(1) == 'i' ? 1 : 0) + countHi(str.substring(1));
}
