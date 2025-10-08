package com.algorithmtracker.performance;

import com.algorithmtracker.algorithm.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Tracks and compares the performance of algorithms.
 */
public class PerformanceTracker {
    
    /**
     * Represents a performance result.
     */
    public static class PerformanceResult {
        private Algorithm algorithm;
        private double executionTime;
        private int inputSize;
        
        /**
         * Constructs a performance result.
         * 
         * @param algorithm The algorithm
         * @param executionTime The execution time in milliseconds
         * @param inputSize The size of the input
         */
        public PerformanceResult(Algorithm algorithm, double executionTime, int inputSize) {
            this.algorithm = algorithm;
            this.executionTime = executionTime;
            this.inputSize = inputSize;
        }
        
        /**
         * Gets the algorithm.
         * 
         * @return The algorithm
         */
        public Algorithm getAlgorithm() {
            return algorithm;
        }
        
        /**
         * Gets the execution time.
         * 
         * @return The execution time in milliseconds
         */
        public double getExecutionTime() {
            return executionTime;
        }
        
        /**
         * Gets the input size.
         * 
         * @return The input size
         */
        public int getInputSize() {
            return inputSize;
        }
    }
    
    /**
     * Stores performance results for later analysis.
     */
    private List<PerformanceResult> results = new ArrayList<>();
    
    /**
     * Adds a performance result.
     * 
     * @param result The performance result to add
     */
    public void addResult(PerformanceResult result) {
        results.add(result);
    }
    
    /**
     * Gets all performance results.
     * 
     * @return The list of performance results
     */
    public List<PerformanceResult> getResults() {
        return results;
    }
    
    /**
     * Clears all performance results.
     */
    public void clearResults() {
        results.clear();
    }
    
    /**
     * Gets the average execution time for an algorithm across all results.
     * 
     * @param algorithmName The name of the algorithm
     * @return The average execution time in milliseconds, or -1 if no results exist
     */
    public double getAverageExecutionTime(String algorithmName) {
        List<PerformanceResult> algorithmResults = results.stream()
                .filter(r -> r.getAlgorithm().getName().equals(algorithmName))
                .toList();
        
        if (algorithmResults.isEmpty()) {
            return -1;
        }
        
        double sum = algorithmResults.stream()
                .mapToDouble(PerformanceResult::getExecutionTime)
                .sum();
        
        return sum / algorithmResults.size();
    }
    
    /**
     * Gets the fastest algorithm for a specific input size.
     * 
     * @param inputSize The input size
     * @return The name of the fastest algorithm, or null if no results exist
     */
    public String getFastestAlgorithm(int inputSize) {
        List<PerformanceResult> sizeResults = results.stream()
                .filter(r -> r.getInputSize() == inputSize)
                .toList();
        
        if (sizeResults.isEmpty()) {
            return null;
        }
        
        PerformanceResult fastest = sizeResults.stream()
                .min((r1, r2) -> Double.compare(r1.getExecutionTime(), r2.getExecutionTime()))
                .orElse(null);
        
        return fastest != null ? fastest.getAlgorithm().getName() : null;
    }
}
