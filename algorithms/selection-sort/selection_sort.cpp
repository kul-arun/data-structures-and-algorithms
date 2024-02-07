#include <iostream>
#include <vector>

void display(const std::vector<int>&);
void selectionSort(std::vector<int>&);

int main() {
    std::vector<int> nums = {11, 35, 46, 27, 8, 73, 2};
    std::cout << "Numbers before sorting:\n";
    display(nums);
    selectionSort(nums);
    std::cout << "Numbers after sorting:\n";
    display(nums);
}

void selectionSort(std::vector<int>& nums) {
    int n = static_cast<int>(nums.size());
    for (int i = 0; i < n-1; ++i) {
        // Assume the index of the smallest item to be i.
        int min_element_idx = i; 
        for (int j = i+1; j < n; ++j) {
            if (nums[j] < nums[min_element_idx]) {
                min_element_idx = j;
            }
        }
        // swap elements if smallest item is not at index i.
        if (min_element_idx != i) {
            int temp = nums[i];
            nums[i] = nums[min_element_idx];
            nums[min_element_idx] = temp;
        }
    }
}

// function to output the contents of nums vector in a pretty manner.
void display(const std::vector<int>& nums) {
    std::cout << "[";
    int n = static_cast<int>(nums.size());
    for (int i = 0; i < n-1; ++i) {
        std::cout << nums[i] << ", ";
    }
    std::cout << nums[n-1] << "]\n";
}