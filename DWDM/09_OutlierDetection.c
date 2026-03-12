#include <stdio.h>
#include <math.h>

int main()
{
    int n, i;
    float data[100], sum = 0, mean, std = 0;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter the elements:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%f", &data[i]);
        sum += data[i];
    }
    mean = sum / n;
    for (i = 0; i < n; i++)
    {
        std += pow(data[i] - mean, 2);
    }
    std = sqrt(std / n);

    printf("\nMean = %.2f\n", mean);
    printf("Standard Deviation = %.2f\n", std);

    printf("\nOutliers are:\n");
    for (i = 0; i < n; i++)
    {
        if (data[i] < mean - 2 * std || data[i] > mean + 2 * std)
        {
            printf("%.2f\n", data[i]);
        }
    }

    return 0;
}
