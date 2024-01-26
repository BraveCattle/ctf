#include <bits/stdc++.h>

long SetFileEntryPoint(char *szFilename,long newEntryPoint)
{
    IMAGE_DOS_HEADER *pHead;
    pHead = new IMAGE_DOS_HEADER;
    FILE *file = fopen(szFilename,"r+b");
    if(!file)
        return -1;
    fread(pHead,sizeof(IMAGE_DOS_HEADER),1,file);
    if(pHead->e_magic != IMAGE_DOS_SIGNATURE)
        return -1;
    long peHeader = pHead->e_lfanew;
    long peOptHeader = peHeader + 4 + sizeof(IMAGE_FILE_HEADER);
    fseek(file,peOptHeader,SEEK_SET);
    IMAGE_OPTIONAL_HEADER *pOpt;
    pOpt = new IMAGE_OPTIONAL_HEADER;
    fread(pOpt,sizeof(IMAGE_OPTIONAL_HEADER),1,file);
    pOpt->AddressOfEntryPoint = newEntryPoint;
    fseek(file,peOptHeader,SEEK_SET);
    fwrite(pOpt,sizeof(IMAGE_OPTIONAL_HEADER),1,file);
    fclose(file);
    delete pOpt;
    delete pHead;
    return 1;
}

int main(){
    SetFileEntryPoint("./vuln", 1199);
    return 0;
}