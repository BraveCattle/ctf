#include <iostream>

static int x = []()
{
    std::cout << "Performs before main function" << std::endl;
    return 0;
}();

int main()
{
    std::cout << "Performs inside main function" << std::endl;
    return 0;
}