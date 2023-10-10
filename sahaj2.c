#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LENGTH 100

int solve(char *word, char **word_set, int word_set_size);

int main() {
    int num;
    scanf("%d", &num);

    char **arr_words = (char **)malloc(num * sizeof(char *));
    for (int i = 0; i < num; i++) {
        arr_words[i] = (char *)malloc(MAX_LENGTH * sizeof(char));
        scanf("%s", arr_words[i]);
    }

    char req[MAX_LENGTH];
    scanf("%s", req);

    char **word_set = (char **)malloc(num * sizeof(char *));
    int word_set_size = 0;
    for (int i = 0; i < num; i++) {
        if (strcmp(arr_words[i], req) == 0) {
            continue;
        }
        word_set[word_set_size] = (char *)malloc(MAX_LENGTH * sizeof(char));
        strcpy(word_set[word_set_size], arr_words[i]);
        word_set_size++;
    }

    if (solve(req, word_set, word_set_size)) {
        printf("Harry\n");
    } else {
        printf("Voldemort\n");
    }

    for (int i = 0; i < num; i++) {
        free(arr_words[i]);
    }
    free(arr_words);

    for (int i = 0; i < word_set_size; i++) {
        free(word_set[i]);
    }
    free(word_set);

    return 0;
}

int solve(char *word, char **word_set, int word_set_size) {
    if (strlen(word) == 0) {
        return 1;
    }
    for (int i = 1; i <= strlen(word); i++) {
        char pre[MAX_LENGTH];
        strncpy(pre, word, i);
        pre[i] = '\0';
        for (int j = 0; j < word_set_size; j++) {
            if (strcmp(pre, word_set[j]) == 0 && solve(word + i, word_set, word_set_size)) {
                return 1;
            }
        }
    }
    return 0;
}
