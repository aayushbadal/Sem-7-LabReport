// WAP IN C TO IMPLEMENT DBSCAN ALGORITHM (2D POINTS)

#include <stdio.h>
#include <math.h>

#define MAX 100

// Structure for a point
typedef struct
{
    double x, y;
    int visited;
    int cluster;
} Point;

Point points[MAX];
int n;
double eps;
int MinPts;

// Function to calculate Euclidean Distance
double distance(Point a, Point b)
{
    return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
}

// Find neighbors of a point
int regionQuery(int index, int neighbors[])
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (distance(points[index], points[i]) <= eps)
        {
            neighbors[count++] = i;
        }
    }
    return count;
}

// Expand cluster
void expandCluster(int index, int clusterId)
{
    int neighbors[MAX];
    int neighborCount = regionQuery(index, neighbors);

    points[index].cluster = clusterId;

    for (int i = 0; i < neighborCount; i++)
    {
        int neighborIndex = neighbors[i];

        if (!points[neighborIndex].visited)
        {
            points[neighborIndex].visited = 1;

            int newNeighbors[MAX];
            int newCount = regionQuery(neighborIndex, newNeighbors);

            if (newCount >= MinPts)
            {
                for (int j = 0; j < newCount; j++)
                {
                    neighbors[neighborCount++] = newNeighbors[j];
                }
            }
        }

        if (points[neighborIndex].cluster == 0)
        {
            points[neighborIndex].cluster = clusterId;
        }
    }
}

int main()
{
    int clusterId = 0;

    printf("Enter number of points: ");
    scanf("%d", &n);

    printf("Enter eps value: ");
    scanf("%lf", &eps);

    printf("Enter MinPts value: ");
    scanf("%d", &MinPts);

    printf("Enter x and y coordinates:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%lf %lf", &points[i].x, &points[i].y);
        points[i].visited = 0;
        points[i].cluster = 0;
    }

    for (int i = 0; i < n; i++)
    {
        if (!points[i].visited)
        {
            points[i].visited = 1;

            int neighbors[MAX];
            int neighborCount = regionQuery(i, neighbors);

            if (neighborCount < MinPts)
            {
                points[i].cluster = -1; // Noise
            }
            else
            {
                clusterId++;
                expandCluster(i, clusterId);
            }
        }
    }

    printf("\nDBSCAN Clustering Result:\n");
    for (int i = 0; i < n; i++)
    {
        if (points[i].cluster == -1)
            printf("Point (%.2lf, %.2lf) -> Noise\n", points[i].x, points[i].y);
        else
            printf("Point (%.2lf, %.2lf) -> Cluster %d\n",
                   points[i].x, points[i].y, points[i].cluster);
    }

    return 0;
}
