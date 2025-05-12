package string.kpmalgorithforpatternsearch;

public class Demo1 {
    // KPM uses the Structure of the pattern to avoid redundant comparisons
    // It preprocesses the pattern string and creates an array called the Longest Prefix
    // Suffix (LPS) array which indicates how much of the pattern can be reused after a mismatch

    // LPS(Longest Prefix Suffix)
    // is also a suffix
    // A proper prefix is a prefix that doesn't include whole string
    // Ex : prefixes of 'abc' are "", 'a','ab','abc'.
    // But proper prefixes are "",'a' and 'ab' only
    // Suffixes of the String are "",'c','bc' and 'abc'.
    // Each value ,lps[i] is the length of the longest proper prefix of pat[0,i]which is also
    // a suffix of pat[0.,i]
}
