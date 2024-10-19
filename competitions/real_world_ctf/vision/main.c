void __fastcall __noreturn main(int a1, char **a2, char **a3)
{
	char s[256]; // [rsp+10h] [rbp-510h] BYREF
	char v4[1032]; // [rsp+110h] [rbp-410h] BYREF
	unsigned __int64 v5; // [rsp+518h] [rbp-8h]

	v5 = __readfsqword(0x28u);
	printf("%s", "Welcome to the debug console! Use \"help\" to see supported commands. \n");
	while ( 1 ){
		memset(s, 0, sizeof(s));
		if ( fgets(s, 256, stdin) ){
		memset(v4, 0, 0x400uLL);
		sub_1589(s, v4);
		printf("%s", v4);
		} else puts("Error or EOF encountered.");
	}
}

unsigned __int64 __fastcall sub_1589(char *a1, char *a2){
	unsigned int v2; // eax
	unsigned int v3; // eax
	size_t v4; // rax
	int v6; // [rsp+10h] [rbp-290h] BYREF
	int v7; // [rsp+14h] [rbp-28Ch]
	unsigned int v8; // [rsp+18h] [rbp-288h]
	unsigned int v9; // [rsp+1Ch] [rbp-284h]
	char *v10; // [rsp+20h] [rbp-280h]
	char *v11; // [rsp+28h] [rbp-278h]
	size_t n; // [rsp+30h] [rbp-270h]
	size_t v13; // [rsp+38h] [rbp-268h]
	char *v14; // [rsp+40h] [rbp-260h]
	char *v15; // [rsp+48h] [rbp-258h]
	FILE *stream; // [rsp+50h] [rbp-250h]
	char *v17; // [rsp+58h] [rbp-248h]
	char *v18; // [rsp+60h] [rbp-240h]
	char *v19; // [rsp+68h] [rbp-238h]
	char v20[32]; // [rsp+70h] [rbp-230h] BYREF
	char s2[256]; // [rsp+90h] [rbp-210h] BYREF
	char s[264]; // [rsp+190h] [rbp-110h] BYREF
	unsigned __int64 v23; // [rsp+298h] [rbp-8h]

	v23 = __readfsqword(0x28u);
	sub_1553(a1);
	if ( !strcmp(a1, "help") )
		strcpy(a2, "Supported commands: ping, uname, pwd, date, whoami, poweroff, id, showKey, openthedoor \n");
	else if ( !strcmp(a1, "showKey") )  {
		srand(time(0LL));
		v9 = rand();
		sprintf(s, "%s %d %s", "Key: ", v9, "\n");
		strcpy(a2, s);
	}
	else if ( strchr(a1, '&') || strchr(a1, "||") || strchr(a1, ';') )
		strcpy(a2, "Not Support 1. \n");
	else if ( strchr(a1, '>') || strchr(a1, '<') || strchr(a1, '|') )
		strcpy(a2, "Not Support 2. \n");
	else if ( strchr(a1, '$') || strchr(a1, '`') ){
		strcpy(a2, "Not Support 3. \n");
	} else {
		memset(s2, 0, sizeof(s2));
		v11 = strchr(a1, 32);
		if ( v11 ) strncpy(s2, a1, v11 - a1);
		else strncpy(s2, a1, strlen(a1));
		v13 = strlen(s2); // length of the first arg
		if ( v13 ) {
			v7 = 0;
			v10 = off_4020[0];
			while ( strncmp(v10, s2, v13) ) {
				v10 = off_4020[++v7];
				if ( !off_4020[v7] ) {
					strcpy(a2, "Not Support 4. \n");
					return __readfsqword(0x28u) ^ v23;
				}
			}
			if ( !strncmp("ping", s2, v13) ){
				v14 = strstr(a1, "-c");
				v15 = v14;
				if ( !v14 )        {
					strcpy(a2, "please use ping -c 4. \n");
					return __readfsqword(0x28u) ^ v23;
				}
				if ( strlen(v14) <= 2 )        {
					strcpy(a2, "please use ping -c 4.\n");
					return __readfsqword(0x28u) ^ v23;
				}
				__isoc99_sscanf(v15 + 2, "%d", &v6);
				if ( v6 != 4 )        {
					strcpy(a2, "please use ping -c 4.\n");
					return __readfsqword(0x28u) ^ v23;
				}
			}
			if ( !strncmp("openthedoor", s2, v13) ){
				v17 = strstr(a1, "-k");
				v18 = v17;
				if ( v17 ) {
					if ( strlen(v17) > 2 ) {
						v3 = time(0LL);
						srand(v3);
						v8 = rand();
						sprintf(v20, "%d", v8);
						v19 = strchr(a1, 11627);
						memset(s, 0, 256);
						v4 = strlen(a1);
						strncpy(s, a1 + 14, v4 - 14);
						s[strlen(a1) - 14] = 0;
						if ( !strcmp(v20, s) ){
							memset(a1, 0, 8uLL);
							snprintf(a1, 8uLL, "cat ./flagx \n");
						} else {
							strcpy(a2, "Fail to get shell!\n");
						}
					} else {
						strcpy(a2, "please use openthedoor -k <key>.\n");
					}
				} else {
				strcpy(a2, "please use openthedoor -k <key>. \n");
				}
			} else {
				stream = popen(a1, "re");
				if ( !stream ) {
					perror("popen failed");
					exit(1);
				}
				while ( fgets(s, 256, stream) ) strcat(a2, s);
				pclose(stream);
			}
		} else strcpy(a2, "Please enter command. \n");
	}
	return __readfsqword(0x28u) ^ v23;
}
