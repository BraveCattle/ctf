.class public Lo/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lo/f;Ln/d;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    const/4 v11, 0x2

    if-nez p2, :cond_0

    iget v1, v0, Lo/f;->m0:I

    iget-object v2, v0, Lo/f;->p0:[Lo/c;

    move v13, v1

    move-object v14, v2

    const/4 v15, 0x0

    goto :goto_0

    :cond_0
    iget v1, v0, Lo/f;->n0:I

    iget-object v2, v0, Lo/f;->o0:[Lo/c;

    move v13, v1

    move-object v14, v2

    move v15, v11

    :goto_0
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v13, :cond_6c

    aget-object v1, v14, v9

    .line 1
    iget-boolean v2, v1, Lo/c;->t:Z

    const/16 v16, 0x0

    const/4 v3, 0x3

    const/16 v8, 0x8

    const/4 v5, 0x1

    if-nez v2, :cond_18

    .line 2
    iget v2, v1, Lo/c;->o:I

    mul-int/2addr v2, v11

    iget-object v6, v1, Lo/c;->a:Lo/e;

    move-object v7, v6

    const/16 v17, 0x0

    :goto_2
    if-nez v17, :cond_13

    iget v12, v1, Lo/c;->i:I

    add-int/2addr v12, v5

    iput v12, v1, Lo/c;->i:I

    iget-object v12, v6, Lo/e;->d0:[Lo/e;

    iget v4, v1, Lo/c;->o:I

    aput-object v16, v12, v4

    iget-object v12, v6, Lo/e;->c0:[Lo/e;

    aput-object v16, v12, v4

    .line 3
    iget v12, v6, Lo/e;->X:I

    if-eq v12, v8, :cond_e

    .line 4
    iget v12, v1, Lo/c;->l:I

    add-int/2addr v12, v5

    iput v12, v1, Lo/c;->l:I

    invoke-virtual {v6, v4}, Lo/e;->h(I)I

    move-result v4

    if-eq v4, v3, :cond_3

    iget v4, v1, Lo/c;->m:I

    iget v12, v1, Lo/c;->o:I

    if-nez v12, :cond_1

    .line 5
    invoke-virtual {v6}, Lo/e;->o()I

    move-result v12

    goto :goto_3

    :cond_1
    if-ne v12, v5, :cond_2

    invoke-virtual {v6}, Lo/e;->i()I

    move-result v12

    goto :goto_3

    :cond_2
    const/4 v12, 0x0

    :goto_3
    add-int/2addr v4, v12

    .line 6
    iput v4, v1, Lo/c;->m:I

    :cond_3
    iget v4, v1, Lo/c;->m:I

    iget-object v12, v6, Lo/e;->G:[Lo/d;

    aget-object v12, v12, v2

    invoke-virtual {v12}, Lo/d;->b()I

    move-result v12

    add-int/2addr v12, v4

    iput v12, v1, Lo/c;->m:I

    iget-object v4, v6, Lo/e;->G:[Lo/d;

    add-int/lit8 v19, v2, 0x1

    aget-object v4, v4, v19

    invoke-virtual {v4}, Lo/d;->b()I

    move-result v4

    add-int/2addr v4, v12

    iput v4, v1, Lo/c;->m:I

    iget v4, v1, Lo/c;->n:I

    iget-object v12, v6, Lo/e;->G:[Lo/d;

    aget-object v12, v12, v2

    invoke-virtual {v12}, Lo/d;->b()I

    move-result v12

    add-int/2addr v12, v4

    iput v12, v1, Lo/c;->n:I

    iget-object v4, v6, Lo/e;->G:[Lo/d;

    aget-object v4, v4, v19

    invoke-virtual {v4}, Lo/d;->b()I

    move-result v4

    add-int/2addr v4, v12

    iput v4, v1, Lo/c;->n:I

    iget-object v4, v1, Lo/c;->b:Lo/e;

    if-nez v4, :cond_4

    iput-object v6, v1, Lo/c;->b:Lo/e;

    :cond_4
    iput-object v6, v1, Lo/c;->d:Lo/e;

    iget-object v4, v6, Lo/e;->J:[I

    iget v12, v1, Lo/c;->o:I

    aget v8, v4, v12

    if-ne v8, v3, :cond_e

    iget-object v8, v6, Lo/e;->l:[I

    aget v20, v8, v12

    if-eqz v20, :cond_5

    aget v5, v8, v12

    if-eq v5, v3, :cond_5

    aget v5, v8, v12

    if-ne v5, v11, :cond_e

    :cond_5
    iget v5, v1, Lo/c;->j:I

    const/16 v20, 0x1

    add-int/lit8 v5, v5, 0x1

    iput v5, v1, Lo/c;->j:I

    iget-object v5, v6, Lo/e;->b0:[F

    aget v21, v5, v12

    const/16 v18, 0x0

    cmpl-float v22, v21, v18

    if-lez v22, :cond_6

    iget v11, v1, Lo/c;->k:F

    aget v5, v5, v12

    add-float/2addr v11, v5

    iput v11, v1, Lo/c;->k:F

    .line 7
    :cond_6
    iget v5, v6, Lo/e;->X:I

    const/16 v11, 0x8

    if-eq v5, v11, :cond_8

    .line 8
    aget v4, v4, v12

    if-ne v4, v3, :cond_8

    aget v4, v8, v12

    if-eqz v4, :cond_7

    aget v4, v8, v12

    if-ne v4, v3, :cond_8

    :cond_7
    const/4 v4, 0x1

    goto :goto_4

    :cond_8
    const/4 v4, 0x0

    :goto_4
    if-eqz v4, :cond_b

    const/4 v4, 0x0

    cmpg-float v5, v21, v4

    if-gez v5, :cond_9

    const/4 v4, 0x1

    .line 9
    iput-boolean v4, v1, Lo/c;->q:Z

    goto :goto_5

    :cond_9
    const/4 v4, 0x1

    iput-boolean v4, v1, Lo/c;->r:Z

    :goto_5
    iget-object v4, v1, Lo/c;->h:Ljava/util/ArrayList;

    if-nez v4, :cond_a

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lo/c;->h:Ljava/util/ArrayList;

    :cond_a
    iget-object v4, v1, Lo/c;->h:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    iget-object v4, v1, Lo/c;->f:Lo/e;

    if-nez v4, :cond_c

    iput-object v6, v1, Lo/c;->f:Lo/e;

    :cond_c
    iget-object v4, v1, Lo/c;->g:Lo/e;

    if-eqz v4, :cond_d

    iget-object v4, v4, Lo/e;->c0:[Lo/e;

    iget v5, v1, Lo/c;->o:I

    aput-object v6, v4, v5

    :cond_d
    iput-object v6, v1, Lo/c;->g:Lo/e;

    :cond_e
    if-eq v7, v6, :cond_f

    iget-object v4, v7, Lo/e;->d0:[Lo/e;

    iget v5, v1, Lo/c;->o:I

    aput-object v6, v4, v5

    :cond_f
    iget-object v4, v6, Lo/e;->G:[Lo/d;

    add-int/lit8 v5, v2, 0x1

    aget-object v4, v4, v5

    iget-object v4, v4, Lo/d;->d:Lo/d;

    if-eqz v4, :cond_10

    iget-object v4, v4, Lo/d;->b:Lo/e;

    iget-object v5, v4, Lo/e;->G:[Lo/d;

    aget-object v7, v5, v2

    iget-object v7, v7, Lo/d;->d:Lo/d;

    if-eqz v7, :cond_10

    aget-object v5, v5, v2

    iget-object v5, v5, Lo/d;->d:Lo/d;

    iget-object v5, v5, Lo/d;->b:Lo/e;

    if-eq v5, v6, :cond_11

    :cond_10
    move-object/from16 v4, v16

    :cond_11
    if-eqz v4, :cond_12

    goto :goto_6

    :cond_12
    move-object v4, v6

    const/16 v17, 0x1

    :goto_6
    move-object v7, v6

    const/4 v5, 0x1

    const/16 v8, 0x8

    const/4 v11, 0x2

    move-object v6, v4

    goto/16 :goto_2

    :cond_13
    iget-object v4, v1, Lo/c;->b:Lo/e;

    if-eqz v4, :cond_14

    iget v5, v1, Lo/c;->m:I

    iget-object v4, v4, Lo/e;->G:[Lo/d;

    aget-object v4, v4, v2

    invoke-virtual {v4}, Lo/d;->b()I

    move-result v4

    sub-int/2addr v5, v4

    iput v5, v1, Lo/c;->m:I

    :cond_14
    iget-object v4, v1, Lo/c;->d:Lo/e;

    if-eqz v4, :cond_15

    iget v5, v1, Lo/c;->m:I

    iget-object v4, v4, Lo/e;->G:[Lo/d;

    add-int/lit8 v2, v2, 0x1

    aget-object v2, v4, v2

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    sub-int/2addr v5, v2

    iput v5, v1, Lo/c;->m:I

    :cond_15
    iput-object v6, v1, Lo/c;->c:Lo/e;

    iget v2, v1, Lo/c;->o:I

    if-nez v2, :cond_16

    iget-boolean v2, v1, Lo/c;->p:Z

    if-eqz v2, :cond_16

    iput-object v6, v1, Lo/c;->e:Lo/e;

    goto :goto_7

    :cond_16
    iget-object v2, v1, Lo/c;->a:Lo/e;

    iput-object v2, v1, Lo/c;->e:Lo/e;

    :goto_7
    iget-boolean v2, v1, Lo/c;->r:Z

    if-eqz v2, :cond_17

    iget-boolean v2, v1, Lo/c;->q:Z

    if-eqz v2, :cond_17

    const/4 v2, 0x1

    goto :goto_8

    :cond_17
    const/4 v2, 0x0

    :goto_8
    iput-boolean v2, v1, Lo/c;->s:Z

    const/4 v2, 0x1

    goto :goto_9

    :cond_18
    move v2, v5

    .line 10
    :goto_9
    iput-boolean v2, v1, Lo/c;->t:Z

    .line 11
    iget-object v11, v1, Lo/c;->a:Lo/e;

    iget-object v12, v1, Lo/c;->c:Lo/e;

    iget-object v8, v1, Lo/c;->b:Lo/e;

    iget-object v7, v1, Lo/c;->d:Lo/e;

    iget-object v2, v1, Lo/c;->e:Lo/e;

    iget v4, v1, Lo/c;->k:F

    iget-object v5, v0, Lo/e;->J:[I

    aget v5, v5, p2

    const/4 v6, 0x2

    if-ne v5, v6, :cond_19

    const/4 v5, 0x1

    goto :goto_a

    :cond_19
    const/4 v5, 0x0

    :goto_a
    if-nez p2, :cond_1c

    iget v3, v2, Lo/e;->Z:I

    const/4 v6, 0x1

    if-nez v3, :cond_1a

    const/16 v20, 0x1

    goto :goto_b

    :cond_1a
    const/16 v20, 0x0

    :goto_b
    if-ne v3, v6, :cond_1b

    move/from16 v21, v6

    const/4 v6, 0x2

    goto :goto_c

    :cond_1b
    const/4 v6, 0x2

    const/16 v21, 0x0

    :goto_c
    move/from16 v22, v20

    if-ne v3, v6, :cond_1f

    goto :goto_f

    :cond_1c
    iget v3, v2, Lo/e;->a0:I

    const/4 v6, 0x1

    if-nez v3, :cond_1d

    const/16 v22, 0x1

    goto :goto_d

    :cond_1d
    const/16 v22, 0x0

    :goto_d
    if-ne v3, v6, :cond_1e

    const/4 v6, 0x2

    const/16 v21, 0x1

    goto :goto_e

    :cond_1e
    const/4 v6, 0x2

    const/16 v21, 0x0

    :goto_e
    if-ne v3, v6, :cond_1f

    :goto_f
    const/4 v3, 0x1

    goto :goto_10

    :cond_1f
    const/4 v3, 0x0

    :goto_10
    move/from16 v24, v4

    move-object v6, v11

    const/16 v23, 0x0

    :goto_11
    if-nez v23, :cond_2c

    iget-object v4, v6, Lo/e;->G:[Lo/d;

    aget-object v4, v4, v15

    if-eqz v3, :cond_20

    const/16 v25, 0x1

    goto :goto_12

    :cond_20
    const/16 v25, 0x4

    :goto_12
    invoke-virtual {v4}, Lo/d;->b()I

    move-result v26

    move/from16 v27, v9

    iget-object v9, v6, Lo/e;->J:[I

    aget v9, v9, p2

    move/from16 v28, v13

    const/4 v13, 0x3

    if-ne v9, v13, :cond_21

    iget-object v9, v6, Lo/e;->l:[I

    aget v9, v9, p2

    if-nez v9, :cond_21

    const/4 v9, 0x1

    goto :goto_13

    :cond_21
    const/4 v9, 0x0

    :goto_13
    iget-object v13, v4, Lo/d;->d:Lo/d;

    if-eqz v13, :cond_22

    if-eq v6, v11, :cond_22

    invoke-virtual {v13}, Lo/d;->b()I

    move-result v13

    add-int v26, v13, v26

    :cond_22
    move/from16 v13, v26

    if-eqz v3, :cond_23

    if-eq v6, v11, :cond_23

    if-eq v6, v8, :cond_23

    move-object/from16 v26, v14

    const/16 v25, 0x5

    goto :goto_14

    :cond_23
    move-object/from16 v26, v14

    :goto_14
    iget-object v14, v4, Lo/d;->d:Lo/d;

    move-object/from16 v29, v2

    if-eqz v14, :cond_26

    if-ne v6, v8, :cond_24

    iget-object v2, v4, Lo/d;->g:Ln/h;

    iget-object v14, v14, Lo/d;->g:Ln/h;

    move-object/from16 v30, v11

    const/4 v11, 0x6

    invoke-virtual {v10, v2, v14, v13, v11}, Ln/d;->f(Ln/h;Ln/h;II)V

    goto :goto_15

    :cond_24
    move-object/from16 v30, v11

    iget-object v2, v4, Lo/d;->g:Ln/h;

    iget-object v11, v14, Lo/d;->g:Ln/h;

    const/16 v14, 0x8

    invoke-virtual {v10, v2, v11, v13, v14}, Ln/d;->f(Ln/h;Ln/h;II)V

    :goto_15
    if-eqz v9, :cond_25

    if-nez v3, :cond_25

    const/4 v2, 0x5

    goto :goto_16

    :cond_25
    move/from16 v2, v25

    :goto_16
    iget-object v9, v4, Lo/d;->g:Ln/h;

    iget-object v4, v4, Lo/d;->d:Lo/d;

    iget-object v4, v4, Lo/d;->g:Ln/h;

    invoke-virtual {v10, v9, v4, v13, v2}, Ln/d;->d(Ln/h;Ln/h;II)Ln/b;

    goto :goto_17

    :cond_26
    move-object/from16 v30, v11

    :goto_17
    if-eqz v5, :cond_28

    .line 12
    iget v2, v6, Lo/e;->X:I

    const/16 v4, 0x8

    if-eq v2, v4, :cond_27

    .line 13
    iget-object v2, v6, Lo/e;->J:[I

    aget v2, v2, p2

    const/4 v4, 0x3

    if-ne v2, v4, :cond_27

    iget-object v2, v6, Lo/e;->G:[Lo/d;

    add-int/lit8 v4, v15, 0x1

    aget-object v4, v2, v4

    iget-object v4, v4, Lo/d;->g:Ln/h;

    aget-object v2, v2, v15

    iget-object v2, v2, Lo/d;->g:Ln/h;

    const/4 v9, 0x5

    const/4 v11, 0x0

    invoke-virtual {v10, v4, v2, v11, v9}, Ln/d;->f(Ln/h;Ln/h;II)V

    goto :goto_18

    :cond_27
    const/4 v11, 0x0

    :goto_18
    iget-object v2, v6, Lo/e;->G:[Lo/d;

    aget-object v2, v2, v15

    iget-object v2, v2, Lo/d;->g:Ln/h;

    iget-object v4, v0, Lo/e;->G:[Lo/d;

    aget-object v4, v4, v15

    iget-object v4, v4, Lo/d;->g:Ln/h;

    const/16 v9, 0x8

    invoke-virtual {v10, v2, v4, v11, v9}, Ln/d;->f(Ln/h;Ln/h;II)V

    :cond_28
    iget-object v2, v6, Lo/e;->G:[Lo/d;

    add-int/lit8 v4, v15, 0x1

    aget-object v2, v2, v4

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_29

    iget-object v2, v2, Lo/d;->b:Lo/e;

    iget-object v4, v2, Lo/e;->G:[Lo/d;

    aget-object v9, v4, v15

    iget-object v9, v9, Lo/d;->d:Lo/d;

    if-eqz v9, :cond_29

    aget-object v4, v4, v15

    iget-object v4, v4, Lo/d;->d:Lo/d;

    iget-object v4, v4, Lo/d;->b:Lo/e;

    if-eq v4, v6, :cond_2a

    :cond_29
    move-object/from16 v2, v16

    :cond_2a
    if-eqz v2, :cond_2b

    move-object v6, v2

    goto :goto_19

    :cond_2b
    const/16 v23, 0x1

    :goto_19
    move-object/from16 v14, v26

    move/from16 v9, v27

    move/from16 v13, v28

    move-object/from16 v2, v29

    move-object/from16 v11, v30

    goto/16 :goto_11

    :cond_2c
    move-object/from16 v29, v2

    move/from16 v27, v9

    move-object/from16 v30, v11

    move/from16 v28, v13

    move-object/from16 v26, v14

    if-eqz v7, :cond_30

    iget-object v2, v12, Lo/e;->G:[Lo/d;

    add-int/lit8 v4, v15, 0x1

    aget-object v2, v2, v4

    iget-object v2, v2, Lo/d;->d:Lo/d;

    if-eqz v2, :cond_30

    iget-object v2, v7, Lo/e;->G:[Lo/d;

    aget-object v2, v2, v4

    iget-object v6, v7, Lo/e;->J:[I

    aget v6, v6, p2

    const/4 v9, 0x3

    if-ne v6, v9, :cond_2d

    iget-object v6, v7, Lo/e;->l:[I

    aget v6, v6, p2

    if-nez v6, :cond_2d

    const/4 v6, 0x1

    goto :goto_1a

    :cond_2d
    const/4 v6, 0x0

    :goto_1a
    if-eqz v6, :cond_2e

    if-nez v3, :cond_2e

    iget-object v6, v2, Lo/d;->d:Lo/d;

    iget-object v9, v6, Lo/d;->b:Lo/e;

    if-ne v9, v0, :cond_2e

    iget-object v9, v2, Lo/d;->g:Ln/h;

    iget-object v6, v6, Lo/d;->g:Ln/h;

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v11

    neg-int v11, v11

    const/4 v13, 0x5

    invoke-virtual {v10, v9, v6, v11, v13}, Ln/d;->d(Ln/h;Ln/h;II)Ln/b;

    goto :goto_1b

    :cond_2e
    const/4 v13, 0x5

    if-eqz v3, :cond_2f

    iget-object v6, v2, Lo/d;->d:Lo/d;

    iget-object v9, v6, Lo/d;->b:Lo/e;

    if-ne v9, v0, :cond_2f

    iget-object v9, v2, Lo/d;->g:Ln/h;

    iget-object v6, v6, Lo/d;->g:Ln/h;

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v11

    neg-int v11, v11

    const/4 v14, 0x4

    invoke-virtual {v10, v9, v6, v11, v14}, Ln/d;->d(Ln/h;Ln/h;II)Ln/b;

    goto :goto_1c

    :cond_2f
    :goto_1b
    const/4 v14, 0x4

    :goto_1c
    iget-object v6, v2, Lo/d;->g:Ln/h;

    iget-object v9, v12, Lo/e;->G:[Lo/d;

    aget-object v4, v9, v4

    iget-object v4, v4, Lo/d;->d:Lo/d;

    iget-object v4, v4, Lo/d;->g:Ln/h;

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v2

    neg-int v2, v2

    const/4 v9, 0x6

    invoke-virtual {v10, v6, v4, v2, v9}, Ln/d;->g(Ln/h;Ln/h;II)V

    goto :goto_1d

    :cond_30
    const/4 v13, 0x5

    const/4 v14, 0x4

    :goto_1d
    if-eqz v5, :cond_31

    iget-object v2, v0, Lo/e;->G:[Lo/d;

    add-int/lit8 v4, v15, 0x1

    aget-object v2, v2, v4

    iget-object v2, v2, Lo/d;->g:Ln/h;

    iget-object v5, v12, Lo/e;->G:[Lo/d;

    aget-object v6, v5, v4

    iget-object v6, v6, Lo/d;->g:Ln/h;

    aget-object v4, v5, v4

    invoke-virtual {v4}, Lo/d;->b()I

    move-result v4

    const/16 v5, 0x8

    invoke-virtual {v10, v2, v6, v4, v5}, Ln/d;->f(Ln/h;Ln/h;II)V

    :cond_31
    iget-object v2, v1, Lo/c;->h:Ljava/util/ArrayList;

    if-eqz v2, :cond_3b

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_3b

    iget-boolean v6, v1, Lo/c;->q:Z

    if-eqz v6, :cond_32

    iget-boolean v6, v1, Lo/c;->s:Z

    if-nez v6, :cond_32

    iget v6, v1, Lo/c;->j:I

    int-to-float v6, v6

    goto :goto_1e

    :cond_32
    move/from16 v6, v24

    :goto_1e
    move-object/from16 v5, v16

    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_1f
    if-ge v11, v4, :cond_3b

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v13, v17

    check-cast v13, Lo/e;

    iget-object v14, v13, Lo/e;->b0:[F

    aget v14, v14, p2

    const/16 v17, 0x0

    cmpg-float v23, v14, v17

    if-gez v23, :cond_34

    iget-boolean v14, v1, Lo/c;->s:Z

    if-eqz v14, :cond_33

    iget-object v0, v13, Lo/e;->G:[Lo/d;

    add-int/lit8 v13, v15, 0x1

    aget-object v13, v0, v13

    iget-object v13, v13, Lo/d;->g:Ln/h;

    aget-object v0, v0, v15

    iget-object v0, v0, Lo/d;->g:Ln/h;

    move/from16 v17, v4

    move-object v14, v13

    const/4 v4, 0x0

    const/4 v13, 0x4

    goto :goto_20

    :cond_33
    const/high16 v14, 0x3f800000    # 1.0f

    :cond_34
    const/16 v17, 0x0

    cmpl-float v23, v14, v17

    if-nez v23, :cond_35

    iget-object v0, v13, Lo/e;->G:[Lo/d;

    add-int/lit8 v13, v15, 0x1

    aget-object v13, v0, v13

    iget-object v13, v13, Lo/d;->g:Ln/h;

    aget-object v0, v0, v15

    iget-object v0, v0, Lo/d;->g:Ln/h;

    move/from16 v17, v4

    move-object v14, v13

    const/4 v4, 0x0

    const/16 v13, 0x8

    :goto_20
    invoke-virtual {v10, v14, v0, v4, v13}, Ln/d;->d(Ln/h;Ln/h;II)Ln/b;

    move-object/from16 v32, v1

    move-object/from16 v31, v2

    move/from16 v23, v6

    const/16 v18, 0x0

    goto/16 :goto_25

    :cond_35
    move/from16 v17, v4

    const/4 v4, 0x0

    if-eqz v5, :cond_3a

    iget-object v5, v5, Lo/e;->G:[Lo/d;

    aget-object v4, v5, v15

    iget-object v4, v4, Lo/d;->g:Ln/h;

    add-int/lit8 v24, v15, 0x1

    aget-object v5, v5, v24

    iget-object v5, v5, Lo/d;->g:Ln/h;

    iget-object v0, v13, Lo/e;->G:[Lo/d;

    move-object/from16 v31, v2

    aget-object v2, v0, v15

    iget-object v2, v2, Lo/d;->g:Ln/h;

    aget-object v0, v0, v24

    iget-object v0, v0, Lo/d;->g:Ln/h;

    move-object/from16 v24, v13

    invoke-virtual/range {p1 .. p1}, Ln/d;->m()Ln/b;

    move-result-object v13

    move-object/from16 v32, v1

    const/4 v1, 0x0

    .line 14
    iput v1, v13, Ln/b;->b:F

    cmpl-float v18, v6, v1

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v18, :cond_39

    cmpl-float v18, v9, v14

    if-nez v18, :cond_36

    goto :goto_22

    :cond_36
    const/16 v18, 0x0

    cmpl-float v33, v9, v18

    if-nez v33, :cond_37

    iget-object v0, v13, Ln/b;->d:Ln/b$a;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v4, v2}, Ln/b$a;->e(Ln/h;F)V

    iget-object v0, v13, Ln/b;->d:Ln/b$a;

    invoke-interface {v0, v5, v1}, Ln/b$a;->e(Ln/h;F)V

    goto :goto_21

    :cond_37
    const/high16 v1, 0x3f800000    # 1.0f

    if-nez v23, :cond_38

    iget-object v4, v13, Ln/b;->d:Ln/b$a;

    invoke-interface {v4, v2, v1}, Ln/b$a;->e(Ln/h;F)V

    iget-object v1, v13, Ln/b;->d:Ln/b$a;

    const/high16 v2, -0x40800000    # -1.0f

    invoke-interface {v1, v0, v2}, Ln/b$a;->e(Ln/h;F)V

    :goto_21
    move/from16 v23, v6

    goto :goto_23

    :cond_38
    div-float/2addr v9, v6

    div-float v23, v14, v6

    div-float v9, v9, v23

    move/from16 v23, v6

    iget-object v6, v13, Ln/b;->d:Ln/b$a;

    invoke-interface {v6, v4, v1}, Ln/b$a;->e(Ln/h;F)V

    iget-object v1, v13, Ln/b;->d:Ln/b$a;

    const/high16 v6, -0x40800000    # -1.0f

    invoke-interface {v1, v5, v6}, Ln/b$a;->e(Ln/h;F)V

    iget-object v1, v13, Ln/b;->d:Ln/b$a;

    invoke-interface {v1, v0, v9}, Ln/b$a;->e(Ln/h;F)V

    iget-object v0, v13, Ln/b;->d:Ln/b$a;

    neg-float v1, v9

    invoke-interface {v0, v2, v1}, Ln/b$a;->e(Ln/h;F)V

    goto :goto_23

    :cond_39
    :goto_22
    move/from16 v23, v6

    const/16 v18, 0x0

    move v6, v1

    const/high16 v1, 0x3f800000    # 1.0f

    iget-object v9, v13, Ln/b;->d:Ln/b$a;

    invoke-interface {v9, v4, v1}, Ln/b$a;->e(Ln/h;F)V

    iget-object v4, v13, Ln/b;->d:Ln/b$a;

    invoke-interface {v4, v5, v6}, Ln/b$a;->e(Ln/h;F)V

    iget-object v4, v13, Ln/b;->d:Ln/b$a;

    invoke-interface {v4, v0, v1}, Ln/b$a;->e(Ln/h;F)V

    iget-object v0, v13, Ln/b;->d:Ln/b$a;

    invoke-interface {v0, v2, v6}, Ln/b$a;->e(Ln/h;F)V

    .line 15
    :goto_23
    invoke-virtual {v10, v13}, Ln/d;->c(Ln/b;)V

    goto :goto_24

    :cond_3a
    move-object/from16 v32, v1

    move-object/from16 v31, v2

    move/from16 v23, v6

    move-object/from16 v24, v13

    const/16 v18, 0x0

    :goto_24
    move v9, v14

    move-object/from16 v5, v24

    :goto_25
    add-int/lit8 v11, v11, 0x1

    move/from16 v4, v17

    move/from16 v6, v23

    move-object/from16 v2, v31

    move-object/from16 v1, v32

    const/4 v13, 0x5

    const/4 v14, 0x4

    move-object/from16 v0, p0

    goto/16 :goto_1f

    :cond_3b
    move-object/from16 v32, v1

    if-eqz v8, :cond_41

    if-eq v8, v7, :cond_3c

    if-eqz v3, :cond_41

    :cond_3c
    move-object/from16 v0, v30

    iget-object v0, v0, Lo/e;->G:[Lo/d;

    aget-object v0, v0, v15

    iget-object v1, v12, Lo/e;->G:[Lo/d;

    add-int/lit8 v2, v15, 0x1

    aget-object v1, v1, v2

    iget-object v0, v0, Lo/d;->d:Lo/d;

    if-eqz v0, :cond_3d

    iget-object v0, v0, Lo/d;->g:Ln/h;

    move-object v3, v0

    goto :goto_26

    :cond_3d
    move-object/from16 v3, v16

    :goto_26
    iget-object v0, v1, Lo/d;->d:Lo/d;

    if-eqz v0, :cond_3e

    iget-object v0, v0, Lo/d;->g:Ln/h;

    move-object v6, v0

    goto :goto_27

    :cond_3e
    move-object/from16 v6, v16

    :goto_27
    iget-object v0, v8, Lo/e;->G:[Lo/d;

    aget-object v0, v0, v15

    iget-object v1, v7, Lo/e;->G:[Lo/d;

    aget-object v1, v1, v2

    if-eqz v3, :cond_40

    if-eqz v6, :cond_40

    move-object/from16 v2, v29

    if-nez p2, :cond_3f

    iget v2, v2, Lo/e;->U:F

    goto :goto_28

    :cond_3f
    iget v2, v2, Lo/e;->V:F

    :goto_28
    move v5, v2

    invoke-virtual {v0}, Lo/d;->b()I

    move-result v4

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v9

    iget-object v2, v0, Lo/d;->g:Ln/h;

    iget-object v0, v1, Lo/d;->g:Ln/h;

    const/4 v11, 0x7

    move-object/from16 v1, p1

    const/4 v13, 0x0

    const/4 v14, 0x2

    move-object v13, v7

    move-object v7, v0

    move-object v0, v8

    move v8, v9

    move/from16 v17, v27

    move v9, v11

    invoke-virtual/range {v1 .. v9}, Ln/d;->b(Ln/h;Ln/h;IFLn/h;Ln/h;II)V

    move-object v11, v0

    goto/16 :goto_35

    :cond_40
    move-object v13, v7

    move-object v0, v8

    move/from16 v17, v27

    const/4 v14, 0x2

    move-object v11, v0

    move-object v0, v10

    goto/16 :goto_43

    :cond_41
    move-object v13, v7

    move-object v11, v8

    move/from16 v17, v27

    move-object/from16 v0, v30

    const/4 v14, 0x2

    if-eqz v22, :cond_54

    if-eqz v11, :cond_54

    move-object/from16 v1, v32

    iget v2, v1, Lo/c;->j:I

    if-lez v2, :cond_42

    iget v1, v1, Lo/c;->i:I

    if-ne v1, v2, :cond_42

    const/16 v20, 0x1

    goto :goto_29

    :cond_42
    const/16 v20, 0x0

    :goto_29
    move-object v8, v11

    move-object v9, v8

    :goto_2a
    if-eqz v9, :cond_53

    iget-object v1, v9, Lo/e;->d0:[Lo/e;

    aget-object v1, v1, p2

    move-object v7, v1

    :goto_2b
    if-eqz v7, :cond_43

    .line 16
    iget v1, v7, Lo/e;->X:I

    const/16 v6, 0x8

    if-ne v1, v6, :cond_44

    .line 17
    iget-object v1, v7, Lo/e;->d0:[Lo/e;

    aget-object v7, v1, p2

    goto :goto_2b

    :cond_43
    const/16 v6, 0x8

    :cond_44
    if-nez v7, :cond_46

    if-ne v9, v13, :cond_45

    goto :goto_2c

    :cond_45
    move-object v14, v7

    move-object/from16 v19, v8

    move-object v10, v9

    goto/16 :goto_33

    :cond_46
    :goto_2c
    iget-object v1, v9, Lo/e;->G:[Lo/d;

    aget-object v1, v1, v15

    iget-object v2, v1, Lo/d;->g:Ln/h;

    iget-object v3, v1, Lo/d;->d:Lo/d;

    if-eqz v3, :cond_47

    iget-object v3, v3, Lo/d;->g:Ln/h;

    goto :goto_2d

    :cond_47
    move-object/from16 v3, v16

    :goto_2d
    if-eq v8, v9, :cond_48

    iget-object v3, v8, Lo/e;->G:[Lo/d;

    add-int/lit8 v4, v15, 0x1

    aget-object v3, v3, v4

    goto :goto_2e

    :cond_48
    if-ne v9, v11, :cond_4a

    if-ne v8, v9, :cond_4a

    iget-object v3, v0, Lo/e;->G:[Lo/d;

    aget-object v4, v3, v15

    iget-object v4, v4, Lo/d;->d:Lo/d;

    if-eqz v4, :cond_49

    aget-object v3, v3, v15

    iget-object v3, v3, Lo/d;->d:Lo/d;

    :goto_2e
    iget-object v3, v3, Lo/d;->g:Ln/h;

    goto :goto_2f

    :cond_49
    move-object/from16 v3, v16

    :cond_4a
    :goto_2f
    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    iget-object v4, v9, Lo/e;->G:[Lo/d;

    add-int/lit8 v5, v15, 0x1

    aget-object v4, v4, v5

    invoke-virtual {v4}, Lo/d;->b()I

    move-result v4

    if-eqz v7, :cond_4b

    iget-object v6, v7, Lo/e;->G:[Lo/d;

    aget-object v6, v6, v15

    iget-object v14, v6, Lo/d;->g:Ln/h;

    move-object/from16 v18, v6

    iget-object v6, v9, Lo/e;->G:[Lo/d;

    aget-object v6, v6, v5

    goto :goto_31

    :cond_4b
    iget-object v6, v12, Lo/e;->G:[Lo/d;

    aget-object v6, v6, v5

    iget-object v6, v6, Lo/d;->d:Lo/d;

    if-eqz v6, :cond_4c

    iget-object v14, v6, Lo/d;->g:Ln/h;

    move-object/from16 v18, v6

    goto :goto_30

    :cond_4c
    move-object/from16 v18, v6

    move-object/from16 v14, v16

    :goto_30
    iget-object v6, v9, Lo/e;->G:[Lo/d;

    aget-object v6, v6, v5

    :goto_31
    iget-object v6, v6, Lo/d;->g:Ln/h;

    if-eqz v18, :cond_4d

    invoke-virtual/range {v18 .. v18}, Lo/d;->b()I

    move-result v18

    add-int v4, v4, v18

    :cond_4d
    move/from16 v18, v4

    if-eqz v8, :cond_4e

    iget-object v4, v8, Lo/e;->G:[Lo/d;

    aget-object v4, v4, v5

    invoke-virtual {v4}, Lo/d;->b()I

    move-result v4

    add-int/2addr v1, v4

    :cond_4e
    if-eqz v2, :cond_45

    if-eqz v3, :cond_45

    if-eqz v14, :cond_45

    if-eqz v6, :cond_45

    if-ne v9, v11, :cond_4f

    iget-object v1, v11, Lo/e;->G:[Lo/d;

    aget-object v1, v1, v15

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    :cond_4f
    move v4, v1

    if-ne v9, v13, :cond_50

    iget-object v1, v13, Lo/e;->G:[Lo/d;

    aget-object v1, v1, v5

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    move/from16 v18, v1

    :cond_50
    if-eqz v20, :cond_51

    const/16 v23, 0x8

    goto :goto_32

    :cond_51
    const/16 v23, 0x5

    :goto_32
    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    const/4 v10, 0x5

    move-object/from16 v19, v6

    const/16 v24, 0x8

    move-object v6, v14

    move-object v14, v7

    move-object/from16 v7, v19

    move-object/from16 v19, v8

    move/from16 v10, v24

    move/from16 v8, v18

    move-object v10, v9

    move/from16 v9, v23

    invoke-virtual/range {v1 .. v9}, Ln/d;->b(Ln/h;Ln/h;IFLn/h;Ln/h;II)V

    .line 18
    :goto_33
    iget v1, v10, Lo/e;->X:I

    const/16 v2, 0x8

    if-eq v1, v2, :cond_52

    move-object v8, v10

    goto :goto_34

    :cond_52
    move-object/from16 v8, v19

    :goto_34
    move-object/from16 v10, p1

    move-object v9, v14

    const/4 v14, 0x2

    goto/16 :goto_2a

    :cond_53
    :goto_35
    move-object/from16 v0, p1

    goto/16 :goto_43

    :cond_54
    move-object/from16 v1, v32

    if-eqz v21, :cond_53

    if-eqz v11, :cond_53

    .line 19
    iget v2, v1, Lo/c;->j:I

    if-lez v2, :cond_55

    iget v1, v1, Lo/c;->i:I

    if-ne v1, v2, :cond_55

    const/16 v20, 0x1

    goto :goto_36

    :cond_55
    const/16 v20, 0x0

    :goto_36
    move-object v10, v11

    move-object v14, v10

    :goto_37
    if-eqz v10, :cond_60

    iget-object v1, v10, Lo/e;->d0:[Lo/e;

    aget-object v1, v1, p2

    :goto_38
    if-eqz v1, :cond_56

    .line 20
    iget v2, v1, Lo/e;->X:I

    const/16 v3, 0x8

    if-ne v2, v3, :cond_56

    .line 21
    iget-object v1, v1, Lo/e;->d0:[Lo/e;

    aget-object v1, v1, p2

    goto :goto_38

    :cond_56
    if-eq v10, v11, :cond_5e

    if-eq v10, v13, :cond_5e

    if-eqz v1, :cond_5e

    if-ne v1, v13, :cond_57

    move-object/from16 v9, v16

    goto :goto_39

    :cond_57
    move-object v9, v1

    :goto_39
    iget-object v1, v10, Lo/e;->G:[Lo/d;

    aget-object v1, v1, v15

    iget-object v2, v1, Lo/d;->g:Ln/h;

    iget-object v3, v14, Lo/e;->G:[Lo/d;

    add-int/lit8 v4, v15, 0x1

    aget-object v3, v3, v4

    iget-object v3, v3, Lo/d;->g:Ln/h;

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    iget-object v5, v10, Lo/e;->G:[Lo/d;

    aget-object v5, v5, v4

    invoke-virtual {v5}, Lo/d;->b()I

    move-result v5

    if-eqz v9, :cond_59

    iget-object v6, v9, Lo/e;->G:[Lo/d;

    aget-object v6, v6, v15

    iget-object v7, v6, Lo/d;->g:Ln/h;

    iget-object v8, v6, Lo/d;->d:Lo/d;

    if-eqz v8, :cond_58

    goto :goto_3b

    :cond_58
    move-object/from16 v8, v16

    goto :goto_3c

    :cond_59
    iget-object v6, v13, Lo/e;->G:[Lo/d;

    aget-object v6, v6, v15

    if-eqz v6, :cond_5a

    iget-object v7, v6, Lo/d;->g:Ln/h;

    goto :goto_3a

    :cond_5a
    move-object/from16 v7, v16

    :goto_3a
    iget-object v8, v10, Lo/e;->G:[Lo/d;

    aget-object v8, v8, v4

    :goto_3b
    iget-object v8, v8, Lo/d;->g:Ln/h;

    :goto_3c
    if-eqz v6, :cond_5b

    invoke-virtual {v6}, Lo/d;->b()I

    move-result v6

    add-int/2addr v6, v5

    move/from16 v18, v6

    goto :goto_3d

    :cond_5b
    move/from16 v18, v5

    :goto_3d
    iget-object v5, v14, Lo/e;->G:[Lo/d;

    aget-object v4, v5, v4

    invoke-virtual {v4}, Lo/d;->b()I

    move-result v4

    add-int/2addr v4, v1

    if-eqz v20, :cond_5c

    const/16 v19, 0x8

    goto :goto_3e

    :cond_5c
    const/16 v19, 0x4

    :goto_3e
    if-eqz v2, :cond_5d

    if-eqz v3, :cond_5d

    if-eqz v7, :cond_5d

    if-eqz v8, :cond_5d

    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    const/16 v23, 0x4

    move-object v6, v7

    move-object v7, v8

    move/from16 v8, v18

    move-object/from16 v18, v9

    move/from16 v9, v19

    invoke-virtual/range {v1 .. v9}, Ln/d;->b(Ln/h;Ln/h;IFLn/h;Ln/h;II)V

    goto :goto_3f

    :cond_5d
    move-object/from16 v18, v9

    const/16 v23, 0x4

    :goto_3f
    move-object/from16 v8, v18

    goto :goto_40

    :cond_5e
    const/16 v23, 0x4

    move-object v8, v1

    .line 22
    :goto_40
    iget v1, v10, Lo/e;->X:I

    const/16 v2, 0x8

    if-eq v1, v2, :cond_5f

    move-object v14, v10

    :cond_5f
    move-object v10, v8

    goto/16 :goto_37

    .line 23
    :cond_60
    iget-object v1, v11, Lo/e;->G:[Lo/d;

    aget-object v1, v1, v15

    iget-object v0, v0, Lo/e;->G:[Lo/d;

    aget-object v0, v0, v15

    iget-object v0, v0, Lo/d;->d:Lo/d;

    iget-object v2, v13, Lo/e;->G:[Lo/d;

    add-int/lit8 v3, v15, 0x1

    aget-object v10, v2, v3

    iget-object v2, v12, Lo/e;->G:[Lo/d;

    aget-object v2, v2, v3

    iget-object v14, v2, Lo/d;->d:Lo/d;

    if-eqz v0, :cond_63

    if-eq v11, v13, :cond_61

    iget-object v2, v1, Lo/d;->g:Ln/h;

    iget-object v0, v0, Lo/d;->g:Ln/h;

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v1

    move-object/from16 v9, p1

    const/4 v8, 0x5

    invoke-virtual {v9, v2, v0, v1, v8}, Ln/d;->d(Ln/h;Ln/h;II)Ln/b;

    goto :goto_41

    :cond_61
    move-object/from16 v9, p1

    const/4 v8, 0x5

    if-eqz v14, :cond_62

    iget-object v2, v1, Lo/d;->g:Ln/h;

    iget-object v3, v0, Lo/d;->g:Ln/h;

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    iget-object v6, v10, Lo/d;->g:Ln/h;

    iget-object v7, v14, Lo/d;->g:Ln/h;

    invoke-virtual {v10}, Lo/d;->b()I

    move-result v0

    const/16 v18, 0x5

    move-object/from16 v1, p1

    move v8, v0

    move-object v0, v9

    move/from16 v9, v18

    invoke-virtual/range {v1 .. v9}, Ln/d;->b(Ln/h;Ln/h;IFLn/h;Ln/h;II)V

    goto :goto_42

    :cond_62
    :goto_41
    move-object v0, v9

    goto :goto_42

    :cond_63
    move-object/from16 v0, p1

    :goto_42
    if-eqz v14, :cond_64

    if-eq v11, v13, :cond_64

    iget-object v1, v10, Lo/d;->g:Ln/h;

    iget-object v2, v14, Lo/d;->g:Ln/h;

    invoke-virtual {v10}, Lo/d;->b()I

    move-result v3

    neg-int v3, v3

    const/4 v4, 0x5

    invoke-virtual {v0, v1, v2, v3, v4}, Ln/d;->d(Ln/h;Ln/h;II)Ln/b;

    :cond_64
    :goto_43
    if-nez v22, :cond_65

    if-eqz v21, :cond_6b

    :cond_65
    if-eqz v11, :cond_6b

    if-eq v11, v13, :cond_6b

    iget-object v1, v11, Lo/e;->G:[Lo/d;

    aget-object v2, v1, v15

    iget-object v3, v13, Lo/e;->G:[Lo/d;

    add-int/lit8 v4, v15, 0x1

    aget-object v3, v3, v4

    iget-object v5, v2, Lo/d;->d:Lo/d;

    if-eqz v5, :cond_66

    iget-object v5, v5, Lo/d;->g:Ln/h;

    goto :goto_44

    :cond_66
    move-object/from16 v5, v16

    :goto_44
    iget-object v6, v3, Lo/d;->d:Lo/d;

    if-eqz v6, :cond_67

    iget-object v6, v6, Lo/d;->g:Ln/h;

    goto :goto_45

    :cond_67
    move-object/from16 v6, v16

    :goto_45
    if-eq v12, v13, :cond_69

    iget-object v6, v12, Lo/e;->G:[Lo/d;

    aget-object v6, v6, v4

    iget-object v6, v6, Lo/d;->d:Lo/d;

    if-eqz v6, :cond_68

    iget-object v6, v6, Lo/d;->g:Ln/h;

    move-object/from16 v16, v6

    :cond_68
    move-object/from16 v6, v16

    :cond_69
    if-ne v11, v13, :cond_6a

    aget-object v2, v1, v15

    aget-object v3, v1, v4

    :cond_6a
    if-eqz v5, :cond_6b

    if-eqz v6, :cond_6b

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-virtual {v2}, Lo/d;->b()I

    move-result v8

    iget-object v1, v13, Lo/e;->G:[Lo/d;

    aget-object v1, v1, v4

    invoke-virtual {v1}, Lo/d;->b()I

    move-result v9

    iget-object v2, v2, Lo/d;->g:Ln/h;

    iget-object v10, v3, Lo/d;->g:Ln/h;

    const/4 v11, 0x5

    move-object/from16 v1, p1

    move-object v3, v5

    move v4, v8

    move v5, v7

    move-object v7, v10

    move v8, v9

    move v9, v11

    invoke-virtual/range {v1 .. v9}, Ln/d;->b(Ln/h;Ln/h;IFLn/h;Ln/h;II)V

    :cond_6b
    add-int/lit8 v9, v17, 0x1

    move-object v10, v0

    move-object/from16 v14, v26

    move/from16 v13, v28

    const/4 v11, 0x2

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_6c
    return-void
.end method
