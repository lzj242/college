int t = 1, i = -1,d;
    int nums[10];
    if (x < 0)
    {
        return false;
    }
    else if (x == 0)
    {
        return true;
    }
    else
    {
        while (1)
        {
            t = x % 10;
            x /= 10;
            i++;
            nums[i] = t;
            if(t==0)
            {
                break;
            }
        }
        for ( d = 0; d < i / 2; d++)
        {

            if (nums[d] != nums[d + (i / 2)])
            {
                return false;
            }
        }
        if(d>=(i/2))
        {
            return true;
        }
        return false;
    }