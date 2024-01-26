.class public Lo/f;
.super Lo/l;
.source ""


# instance fields
.field public f0:Lp/b;

.field public g0:Lp/e;

.field public h0:Lp/b$b;

.field public i0:Z

.field public j0:Ln/d;

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:I

.field public o0:[Lo/c;

.field public p0:[Lo/c;

.field public q0:I

.field public r0:Z

.field public s0:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lo/l;-><init>()V

    new-instance v0, Lp/b;

    invoke-direct {v0, p0}, Lp/b;-><init>(Lo/f;)V

    iput-object v0, p0, Lo/f;->f0:Lp/b;

    new-instance v0, Lp/e;

    invoke-direct {v0, p0}, Lp/e;-><init>(Lo/f;)V

    iput-object v0, p0, Lo/f;->g0:Lp/e;

    const/4 v0, 0x0

    iput-object v0, p0, Lo/f;->h0:Lp/b$b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/f;->i0:Z

    new-instance v1, Ln/d;

    invoke-direct {v1}, Ln/d;-><init>()V

    iput-object v1, p0, Lo/f;->j0:Ln/d;

    iput v0, p0, Lo/f;->m0:I

    iput v0, p0, Lo/f;->n0:I

    const/4 v1, 0x4

    new-array v2, v1, [Lo/c;

    iput-object v2, p0, Lo/f;->o0:[Lo/c;

    new-array v1, v1, [Lo/c;

    iput-object v1, p0, Lo/f;->p0:[Lo/c;

    const/16 v1, 0x107

    iput v1, p0, Lo/f;->q0:I

    iput-boolean v0, p0, Lo/f;->r0:Z

    iput-boolean v0, p0, Lo/f;->s0:Z

    return-void
.end method


# virtual methods
.method public C(ZZ)V
    .locals 3

    invoke-super {p0, p1, p2}, Lo/e;->C(ZZ)V

    iget-object v0, p0, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/e;

    invoke-virtual {v2, p1, p2}, Lo/e;->C(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public E()V
    .locals 18

    move-object/from16 v1, p0

    const/4 v2, 0x0

    iput v2, v1, Lo/e;->P:I

    iput v2, v1, Lo/e;->Q:I

    invoke-virtual/range {p0 .. p0}, Lo/e;->o()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lo/e;->i()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput-boolean v2, v1, Lo/f;->r0:Z

    iput-boolean v2, v1, Lo/f;->s0:Z

    .line 1
    iget v0, v1, Lo/f;->q0:I

    and-int/lit8 v5, v0, 0x40

    const/16 v6, 0x40

    const/4 v7, 0x1

    if-ne v5, v6, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v2

    :goto_0
    if-nez v5, :cond_3

    and-int/lit16 v5, v0, 0x80

    const/16 v6, 0x80

    if-ne v5, v6, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    move v5, v2

    goto :goto_3

    :cond_3
    :goto_2
    move v5, v7

    .line 2
    :goto_3
    iget-object v6, v1, Lo/f;->j0:Ln/d;

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-boolean v2, v6, Ln/d;->f:Z

    if-eqz v0, :cond_4

    if-eqz v5, :cond_4

    iput-boolean v7, v6, Ln/d;->f:Z

    :cond_4
    iget-object v0, v1, Lo/e;->J:[I

    aget v5, v0, v7

    aget v6, v0, v2

    iget-object v8, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Lo/e;->j()I

    move-result v0

    const/4 v9, 0x2

    if-eq v0, v9, :cond_6

    invoke-virtual/range {p0 .. p0}, Lo/e;->n()I

    move-result v0

    if-ne v0, v9, :cond_5

    goto :goto_4

    :cond_5
    move v10, v2

    goto :goto_5

    :cond_6
    :goto_4
    move v10, v7

    .line 3
    :goto_5
    iput v2, v1, Lo/f;->m0:I

    iput v2, v1, Lo/f;->n0:I

    .line 4
    iget-object v0, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v11

    move v0, v2

    :goto_6
    if-ge v0, v11, :cond_8

    iget-object v12, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/e;

    instance-of v13, v12, Lo/l;

    if-eqz v13, :cond_7

    check-cast v12, Lo/l;

    invoke-virtual {v12}, Lo/l;->E()V

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_8
    move v0, v2

    move v13, v0

    move v12, v7

    :goto_7
    if-eqz v12, :cond_18

    add-int/lit8 v14, v0, 0x1

    :try_start_0
    iget-object v0, v1, Lo/f;->j0:Ln/d;

    invoke-virtual {v0}, Ln/d;->t()V

    .line 5
    iput v2, v1, Lo/f;->m0:I

    iput v2, v1, Lo/f;->n0:I

    .line 6
    iget-object v0, v1, Lo/f;->j0:Ln/d;

    invoke-virtual {v1, v0}, Lo/e;->e(Ln/d;)V

    move v0, v2

    :goto_8
    if-ge v0, v11, :cond_9

    iget-object v15, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lo/e;

    iget-object v7, v1, Lo/f;->j0:Ln/d;

    invoke-virtual {v15, v7}, Lo/e;->e(Ln/d;)V

    add-int/lit8 v0, v0, 0x1

    const/4 v7, 0x1

    goto :goto_8

    :cond_9
    iget-object v0, v1, Lo/f;->j0:Ln/d;

    invoke-virtual {v1, v0}, Lo/f;->G(Ln/d;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, v1, Lo/f;->j0:Ln/d;

    .line 7
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v7, v0, Ln/d;->f:Z

    if-eqz v7, :cond_d

    move v7, v2

    :goto_9
    iget v12, v0, Ln/d;->i:I

    if-ge v7, v12, :cond_b

    iget-object v12, v0, Ln/d;->e:[Ln/b;

    aget-object v12, v12, v7

    iget-boolean v12, v12, Ln/b;->e:Z

    if-nez v12, :cond_a

    move v7, v2

    goto :goto_a

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_b
    const/4 v7, 0x1

    :goto_a
    if-nez v7, :cond_c

    goto :goto_b

    :cond_c
    invoke-virtual {v0}, Ln/d;->j()V

    goto :goto_c

    :cond_d
    :goto_b
    iget-object v7, v0, Ln/d;->b:Ln/d$a;

    invoke-virtual {v0, v7}, Ln/d;->q(Ln/d$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_c
    const/4 v12, 0x1

    goto :goto_e

    :catch_0
    move-exception v0

    const/4 v12, 0x1

    goto :goto_d

    :catch_1
    move-exception v0

    .line 8
    :goto_d
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EXCEPTION : "

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_e
    iget-object v0, v1, Lo/f;->j0:Ln/d;

    if-eqz v12, :cond_e

    sget-object v2, Lo/j;->a:[Z

    const/4 v7, 0x0

    .line 9
    aput-boolean v7, v2, v9

    invoke-virtual {v1, v0}, Lo/e;->D(Ln/d;)V

    iget-object v2, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v7, 0x0

    :goto_f
    if-ge v7, v2, :cond_f

    iget-object v12, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/e;

    invoke-virtual {v12, v0}, Lo/e;->D(Ln/d;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_f

    .line 10
    :cond_e
    invoke-virtual {v1, v0}, Lo/e;->D(Ln/d;)V

    const/4 v0, 0x0

    :goto_10
    if-ge v0, v11, :cond_f

    iget-object v2, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/e;

    iget-object v7, v1, Lo/f;->j0:Ln/d;

    invoke-virtual {v2, v7}, Lo/e;->D(Ln/d;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    :cond_f
    if-eqz v10, :cond_12

    const/16 v0, 0x8

    if-ge v14, v0, :cond_12

    sget-object v0, Lo/j;->a:[Z

    aget-boolean v0, v0, v9

    if-eqz v0, :cond_12

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    :goto_11
    if-ge v0, v11, :cond_10

    iget-object v12, v1, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/e;

    iget v15, v12, Lo/e;->P:I

    invoke-virtual {v12}, Lo/e;->o()I

    move-result v17

    add-int v15, v17, v15

    invoke-static {v2, v15}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v15, v12, Lo/e;->Q:I

    invoke-virtual {v12}, Lo/e;->i()I

    move-result v12

    add-int/2addr v12, v15

    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    add-int/lit8 v0, v0, 0x1

    goto :goto_11

    :cond_10
    iget v0, v1, Lo/e;->S:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, v1, Lo/e;->T:I

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-ne v6, v9, :cond_11

    invoke-virtual/range {p0 .. p0}, Lo/e;->o()I

    move-result v7

    if-ge v7, v0, :cond_11

    invoke-virtual {v1, v0}, Lo/e;->B(I)V

    iget-object v0, v1, Lo/e;->J:[I

    const/4 v7, 0x0

    aput v9, v0, v7

    const/4 v0, 0x1

    const/4 v13, 0x1

    goto :goto_12

    :cond_11
    const/4 v0, 0x0

    :goto_12
    if-ne v5, v9, :cond_13

    invoke-virtual/range {p0 .. p0}, Lo/e;->i()I

    move-result v7

    if-ge v7, v2, :cond_13

    invoke-virtual {v1, v2}, Lo/e;->w(I)V

    iget-object v0, v1, Lo/e;->J:[I

    const/4 v2, 0x1

    aput v9, v0, v2

    const/4 v0, 0x1

    const/4 v13, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :cond_13
    :goto_13
    iget v2, v1, Lo/e;->S:I

    invoke-virtual/range {p0 .. p0}, Lo/e;->o()I

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lo/e;->o()I

    move-result v7

    if-le v2, v7, :cond_14

    invoke-virtual {v1, v2}, Lo/e;->B(I)V

    iget-object v0, v1, Lo/e;->J:[I

    const/4 v2, 0x1

    const/4 v7, 0x0

    aput v2, v0, v7

    move v0, v2

    move/from16 v16, v0

    goto :goto_14

    :cond_14
    const/4 v2, 0x1

    move/from16 v16, v13

    :goto_14
    iget v7, v1, Lo/e;->T:I

    invoke-virtual/range {p0 .. p0}, Lo/e;->i()I

    move-result v12

    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lo/e;->i()I

    move-result v12

    if-le v7, v12, :cond_15

    invoke-virtual {v1, v7}, Lo/e;->w(I)V

    iget-object v0, v1, Lo/e;->J:[I

    aput v2, v0, v2

    move v0, v2

    move v7, v0

    goto :goto_15

    :cond_15
    move v7, v0

    move/from16 v0, v16

    :goto_15
    if-nez v0, :cond_17

    iget-object v12, v1, Lo/e;->J:[I

    const/4 v13, 0x0

    aget v12, v12, v13

    if-ne v12, v9, :cond_16

    if-lez v3, :cond_16

    invoke-virtual/range {p0 .. p0}, Lo/e;->o()I

    move-result v12

    if-le v12, v3, :cond_16

    iput-boolean v2, v1, Lo/f;->r0:Z

    iget-object v0, v1, Lo/e;->J:[I

    aput v2, v0, v13

    invoke-virtual {v1, v3}, Lo/e;->B(I)V

    move v0, v2

    move v7, v0

    :cond_16
    iget-object v12, v1, Lo/e;->J:[I

    aget v12, v12, v2

    if-ne v12, v9, :cond_17

    if-lez v4, :cond_17

    invoke-virtual/range {p0 .. p0}, Lo/e;->i()I

    move-result v12

    if-le v12, v4, :cond_17

    iput-boolean v2, v1, Lo/f;->s0:Z

    iget-object v0, v1, Lo/e;->J:[I

    aput v2, v0, v2

    invoke-virtual {v1, v4}, Lo/e;->w(I)V

    const/4 v12, 0x1

    const/4 v13, 0x1

    goto :goto_16

    :cond_17
    move v13, v0

    move v12, v7

    :goto_16
    move v0, v14

    const/4 v2, 0x0

    const/4 v7, 0x1

    goto/16 :goto_7

    :cond_18
    iput-object v8, v1, Lo/l;->e0:Ljava/util/ArrayList;

    if-eqz v13, :cond_19

    iget-object v0, v1, Lo/e;->J:[I

    const/4 v2, 0x0

    aput v6, v0, v2

    const/4 v2, 0x1

    aput v5, v0, v2

    :cond_19
    iget-object v0, v1, Lo/f;->j0:Ln/d;

    .line 11
    iget-object v0, v0, Ln/d;->k:Ln/c;

    .line 12
    invoke-virtual {v1, v0}, Lo/l;->v(Ln/c;)V

    return-void
.end method

.method public F(Lo/e;I)V
    .locals 5

    const/4 v0, 0x1

    if-nez p2, :cond_1

    .line 1
    iget p2, p0, Lo/f;->m0:I

    add-int/2addr p2, v0

    iget-object v1, p0, Lo/f;->p0:[Lo/c;

    array-length v2, v1

    if-lt p2, v2, :cond_0

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lo/c;

    iput-object p2, p0, Lo/f;->p0:[Lo/c;

    :cond_0
    iget-object p2, p0, Lo/f;->p0:[Lo/c;

    iget v1, p0, Lo/f;->m0:I

    new-instance v2, Lo/c;

    const/4 v3, 0x0

    .line 2
    iget-boolean v4, p0, Lo/f;->i0:Z

    .line 3
    invoke-direct {v2, p1, v3, v4}, Lo/c;-><init>(Lo/e;IZ)V

    aput-object v2, p2, v1

    add-int/2addr v1, v0

    iput v1, p0, Lo/f;->m0:I

    goto :goto_0

    :cond_1
    if-ne p2, v0, :cond_3

    .line 4
    iget p2, p0, Lo/f;->n0:I

    add-int/2addr p2, v0

    iget-object v1, p0, Lo/f;->o0:[Lo/c;

    array-length v2, v1

    if-lt p2, v2, :cond_2

    array-length p2, v1

    mul-int/lit8 p2, p2, 0x2

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lo/c;

    iput-object p2, p0, Lo/f;->o0:[Lo/c;

    :cond_2
    iget-object p2, p0, Lo/f;->o0:[Lo/c;

    iget v1, p0, Lo/f;->n0:I

    new-instance v2, Lo/c;

    .line 5
    iget-boolean v3, p0, Lo/f;->i0:Z

    .line 6
    invoke-direct {v2, p1, v0, v3}, Lo/c;-><init>(Lo/e;IZ)V

    aput-object v2, p2, v1

    add-int/2addr v1, v0

    iput v1, p0, Lo/f;->n0:I

    :cond_3
    :goto_0
    return-void
.end method

.method public G(Ln/d;)Z
    .locals 11

    invoke-virtual {p0, p1}, Lo/e;->b(Ln/d;)V

    iget-object v0, p0, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v2, v0, :cond_1

    iget-object v5, p0, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/e;

    .line 1
    iget-object v6, v5, Lo/e;->I:[Z

    aput-boolean v1, v6, v1

    aput-boolean v1, v6, v4

    .line 2
    instance-of v5, v5, Lo/a;

    if-eqz v5, :cond_0

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    if-eqz v3, :cond_7

    move v3, v1

    :goto_1
    if-ge v3, v0, :cond_7

    iget-object v5, p0, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/e;

    instance-of v6, v5, Lo/a;

    if-eqz v6, :cond_6

    check-cast v5, Lo/a;

    move v6, v1

    .line 3
    :goto_2
    iget v7, v5, Lo/i;->f0:I

    if-ge v6, v7, :cond_6

    iget-object v7, v5, Lo/i;->e0:[Lo/e;

    aget-object v7, v7, v6

    iget v8, v5, Lo/a;->g0:I

    if-eqz v8, :cond_4

    if-ne v8, v4, :cond_2

    goto :goto_3

    :cond_2
    if-eq v8, v2, :cond_3

    const/4 v9, 0x3

    if-ne v8, v9, :cond_5

    .line 4
    :cond_3
    iget-object v7, v7, Lo/e;->I:[Z

    aput-boolean v4, v7, v4

    goto :goto_4

    :cond_4
    :goto_3
    iget-object v7, v7, Lo/e;->I:[Z

    aput-boolean v4, v7, v1

    :cond_5
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    move v3, v1

    :goto_5
    if-ge v3, v0, :cond_b

    .line 5
    iget-object v5, p0, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/e;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    instance-of v6, v5, Lo/k;

    if-nez v6, :cond_9

    instance-of v6, v5, Lo/g;

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    move v6, v1

    goto :goto_7

    :cond_9
    :goto_6
    move v6, v4

    :goto_7
    if-eqz v6, :cond_a

    .line 7
    invoke-virtual {v5, p1}, Lo/e;->b(Ln/d;)V

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_b
    move v3, v1

    :goto_8
    if-ge v3, v0, :cond_17

    iget-object v5, p0, Lo/l;->e0:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/e;

    instance-of v6, v5, Lo/f;

    if-eqz v6, :cond_f

    iget-object v6, v5, Lo/e;->J:[I

    aget v7, v6, v1

    aget v8, v6, v4

    if-ne v7, v2, :cond_c

    .line 8
    aput v4, v6, v1

    :cond_c
    if-ne v8, v2, :cond_d

    .line 9
    aput v4, v6, v4

    .line 10
    :cond_d
    invoke-virtual {v5, p1}, Lo/e;->b(Ln/d;)V

    if-ne v7, v2, :cond_e

    invoke-virtual {v5, v7}, Lo/e;->x(I)V

    :cond_e
    if-ne v8, v2, :cond_16

    invoke-virtual {v5, v8}, Lo/e;->A(I)V

    goto/16 :goto_b

    :cond_f
    const/4 v6, 0x4

    const/4 v7, -0x1

    .line 11
    iput v7, v5, Lo/e;->h:I

    iput v7, v5, Lo/e;->i:I

    iget-object v7, p0, Lo/e;->J:[I

    aget v7, v7, v1

    if-eq v7, v2, :cond_10

    iget-object v7, v5, Lo/e;->J:[I

    aget v7, v7, v1

    if-ne v7, v6, :cond_10

    iget-object v7, v5, Lo/e;->y:Lo/d;

    iget v7, v7, Lo/d;->e:I

    invoke-virtual {p0}, Lo/e;->o()I

    move-result v8

    iget-object v9, v5, Lo/e;->A:Lo/d;

    iget v9, v9, Lo/d;->e:I

    sub-int/2addr v8, v9

    iget-object v9, v5, Lo/e;->y:Lo/d;

    invoke-virtual {p1, v9}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v10

    iput-object v10, v9, Lo/d;->g:Ln/h;

    iget-object v9, v5, Lo/e;->A:Lo/d;

    invoke-virtual {p1, v9}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v10

    iput-object v10, v9, Lo/d;->g:Ln/h;

    iget-object v9, v5, Lo/e;->y:Lo/d;

    iget-object v9, v9, Lo/d;->g:Ln/h;

    invoke-virtual {p1, v9, v7}, Ln/d;->e(Ln/h;I)V

    iget-object v9, v5, Lo/e;->A:Lo/d;

    iget-object v9, v9, Lo/d;->g:Ln/h;

    invoke-virtual {p1, v9, v8}, Ln/d;->e(Ln/h;I)V

    iput v2, v5, Lo/e;->h:I

    .line 12
    iput v7, v5, Lo/e;->P:I

    sub-int/2addr v8, v7

    iput v8, v5, Lo/e;->L:I

    iget v7, v5, Lo/e;->S:I

    if-ge v8, v7, :cond_10

    iput v7, v5, Lo/e;->L:I

    .line 13
    :cond_10
    iget-object v7, p0, Lo/e;->J:[I

    aget v7, v7, v4

    if-eq v7, v2, :cond_13

    iget-object v7, v5, Lo/e;->J:[I

    aget v7, v7, v4

    if-ne v7, v6, :cond_13

    iget-object v6, v5, Lo/e;->z:Lo/d;

    iget v6, v6, Lo/d;->e:I

    invoke-virtual {p0}, Lo/e;->i()I

    move-result v7

    iget-object v8, v5, Lo/e;->B:Lo/d;

    iget v8, v8, Lo/d;->e:I

    sub-int/2addr v7, v8

    iget-object v8, v5, Lo/e;->z:Lo/d;

    invoke-virtual {p1, v8}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v9

    iput-object v9, v8, Lo/d;->g:Ln/h;

    iget-object v8, v5, Lo/e;->B:Lo/d;

    invoke-virtual {p1, v8}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v9

    iput-object v9, v8, Lo/d;->g:Ln/h;

    iget-object v8, v5, Lo/e;->z:Lo/d;

    iget-object v8, v8, Lo/d;->g:Ln/h;

    invoke-virtual {p1, v8, v6}, Ln/d;->e(Ln/h;I)V

    iget-object v8, v5, Lo/e;->B:Lo/d;

    iget-object v8, v8, Lo/d;->g:Ln/h;

    invoke-virtual {p1, v8, v7}, Ln/d;->e(Ln/h;I)V

    iget v8, v5, Lo/e;->R:I

    if-gtz v8, :cond_11

    .line 14
    iget v8, v5, Lo/e;->X:I

    const/16 v9, 0x8

    if-ne v8, v9, :cond_12

    .line 15
    :cond_11
    iget-object v8, v5, Lo/e;->C:Lo/d;

    invoke-virtual {p1, v8}, Ln/d;->l(Ljava/lang/Object;)Ln/h;

    move-result-object v9

    iput-object v9, v8, Lo/d;->g:Ln/h;

    iget-object v8, v5, Lo/e;->C:Lo/d;

    iget-object v8, v8, Lo/d;->g:Ln/h;

    iget v9, v5, Lo/e;->R:I

    add-int/2addr v9, v6

    invoke-virtual {p1, v8, v9}, Ln/d;->e(Ln/h;I)V

    :cond_12
    iput v2, v5, Lo/e;->i:I

    .line 16
    iput v6, v5, Lo/e;->Q:I

    sub-int/2addr v7, v6

    iput v7, v5, Lo/e;->M:I

    iget v6, v5, Lo/e;->T:I

    if-ge v7, v6, :cond_13

    iput v6, v5, Lo/e;->M:I

    .line 17
    :cond_13
    instance-of v6, v5, Lo/k;

    if-nez v6, :cond_15

    instance-of v6, v5, Lo/g;

    if-eqz v6, :cond_14

    goto :goto_9

    :cond_14
    move v6, v1

    goto :goto_a

    :cond_15
    :goto_9
    move v6, v4

    :goto_a
    if-nez v6, :cond_16

    .line 18
    invoke-virtual {v5, p1}, Lo/e;->b(Ln/d;)V

    :cond_16
    :goto_b
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_8

    :cond_17
    iget v0, p0, Lo/f;->m0:I

    if-lez v0, :cond_18

    invoke-static {p0, p1, v1}, Lo/b;->a(Lo/f;Ln/d;I)V

    :cond_18
    iget v0, p0, Lo/f;->n0:I

    if-lez v0, :cond_19

    invoke-static {p0, p1, v4}, Lo/b;->a(Lo/f;Ln/d;I)V

    :cond_19
    return v4
.end method

.method public H(ZI)Z
    .locals 11

    iget-object v0, p0, Lo/f;->g0:Lp/e;

    const/4 v1, 0x1

    and-int/2addr p1, v1

    .line 1
    iget-object v2, v0, Lp/e;->a:Lo/f;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lo/e;->h(I)I

    move-result v2

    iget-object v4, v0, Lp/e;->a:Lo/f;

    invoke-virtual {v4, v1}, Lo/e;->h(I)I

    move-result v4

    iget-object v5, v0, Lp/e;->a:Lo/f;

    invoke-virtual {v5}, Lo/e;->p()I

    move-result v5

    iget-object v6, v0, Lp/e;->a:Lo/f;

    invoke-virtual {v6}, Lo/e;->q()I

    move-result v6

    if-eqz p1, :cond_4

    const/4 v7, 0x2

    if-eq v2, v7, :cond_0

    if-ne v4, v7, :cond_4

    :cond_0
    iget-object v8, v0, Lp/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lp/m;

    iget v10, v9, Lp/m;->f:I

    if-ne v10, p2, :cond_1

    invoke-virtual {v9}, Lp/m;->k()Z

    move-result v9

    if-nez v9, :cond_1

    move p1, v3

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    if-ne v2, v7, :cond_4

    iget-object p1, v0, Lp/e;->a:Lo/f;

    .line 2
    iget-object v7, p1, Lo/e;->J:[I

    aput v1, v7, v3

    .line 3
    invoke-virtual {v0, p1, v3}, Lp/e;->d(Lo/f;I)I

    move-result v7

    invoke-virtual {p1, v7}, Lo/e;->B(I)V

    iget-object p1, v0, Lp/e;->a:Lo/f;

    iget-object v7, p1, Lo/e;->d:Lp/j;

    iget-object v7, v7, Lp/m;->e:Lp/g;

    invoke-virtual {p1}, Lo/e;->o()I

    move-result p1

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    if-ne v4, v7, :cond_4

    iget-object p1, v0, Lp/e;->a:Lo/f;

    .line 4
    iget-object v7, p1, Lo/e;->J:[I

    aput v1, v7, v1

    .line 5
    invoke-virtual {v0, p1, v1}, Lp/e;->d(Lo/f;I)I

    move-result v7

    invoke-virtual {p1, v7}, Lo/e;->w(I)V

    iget-object p1, v0, Lp/e;->a:Lo/f;

    iget-object v7, p1, Lo/e;->e:Lp/l;

    iget-object v7, v7, Lp/m;->e:Lp/g;

    invoke-virtual {p1}, Lo/e;->i()I

    move-result p1

    :goto_0
    invoke-virtual {v7, p1}, Lp/g;->c(I)V

    :cond_4
    iget-object p1, v0, Lp/e;->a:Lo/f;

    iget-object v7, p1, Lo/e;->J:[I

    const/4 v8, 0x4

    if-nez p2, :cond_6

    aget v6, v7, v3

    if-eq v6, v1, :cond_5

    aget v6, v7, v3

    if-ne v6, v8, :cond_7

    :cond_5
    invoke-virtual {p1}, Lo/e;->o()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v6, v0, Lp/e;->a:Lo/f;

    iget-object v6, v6, Lo/e;->d:Lp/j;

    iget-object v6, v6, Lp/m;->i:Lp/f;

    invoke-virtual {v6, p1}, Lp/f;->c(I)V

    iget-object v6, v0, Lp/e;->a:Lo/f;

    iget-object v6, v6, Lo/e;->d:Lp/j;

    iget-object v6, v6, Lp/m;->e:Lp/g;

    sub-int/2addr p1, v5

    goto :goto_2

    :cond_6
    aget v5, v7, v1

    if-eq v5, v1, :cond_8

    aget v5, v7, v1

    if-ne v5, v8, :cond_7

    goto :goto_1

    :cond_7
    move p1, v3

    goto :goto_3

    :cond_8
    :goto_1
    invoke-virtual {p1}, Lo/e;->i()I

    move-result p1

    add-int/2addr p1, v6

    iget-object v5, v0, Lp/e;->a:Lo/f;

    iget-object v5, v5, Lo/e;->e:Lp/l;

    iget-object v5, v5, Lp/m;->i:Lp/f;

    invoke-virtual {v5, p1}, Lp/f;->c(I)V

    iget-object v5, v0, Lp/e;->a:Lo/f;

    iget-object v5, v5, Lo/e;->e:Lp/l;

    iget-object v5, v5, Lp/m;->e:Lp/g;

    sub-int/2addr p1, v6

    move-object v6, v5

    :goto_2
    invoke-virtual {v6, p1}, Lp/g;->c(I)V

    move p1, v1

    :goto_3
    invoke-virtual {v0}, Lp/e;->g()V

    iget-object v5, v0, Lp/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp/m;

    iget v7, v6, Lp/m;->f:I

    if-eq v7, p2, :cond_9

    goto :goto_4

    :cond_9
    iget-object v7, v6, Lp/m;->b:Lo/e;

    iget-object v8, v0, Lp/e;->a:Lo/f;

    if-ne v7, v8, :cond_a

    iget-boolean v7, v6, Lp/m;->g:Z

    if-nez v7, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v6}, Lp/m;->e()V

    goto :goto_4

    :cond_b
    iget-object v5, v0, Lp/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp/m;

    iget v7, v6, Lp/m;->f:I

    if-eq v7, p2, :cond_d

    goto :goto_5

    :cond_d
    if-nez p1, :cond_e

    iget-object v7, v6, Lp/m;->b:Lo/e;

    iget-object v8, v0, Lp/e;->a:Lo/f;

    if-ne v7, v8, :cond_e

    goto :goto_5

    :cond_e
    iget-object v7, v6, Lp/m;->h:Lp/f;

    iget-boolean v7, v7, Lp/f;->j:Z

    if-nez v7, :cond_f

    goto :goto_6

    :cond_f
    iget-object v7, v6, Lp/m;->i:Lp/f;

    iget-boolean v7, v7, Lp/f;->j:Z

    if-nez v7, :cond_10

    goto :goto_6

    :cond_10
    instance-of v7, v6, Lp/c;

    if-nez v7, :cond_c

    iget-object v6, v6, Lp/m;->e:Lp/g;

    iget-boolean v6, v6, Lp/f;->j:Z

    if-nez v6, :cond_c

    :goto_6
    move v1, v3

    :cond_11
    iget-object p1, v0, Lp/e;->a:Lo/f;

    invoke-virtual {p1, v2}, Lo/e;->x(I)V

    iget-object p1, v0, Lp/e;->a:Lo/f;

    invoke-virtual {p1, v4}, Lo/e;->A(I)V

    return v1
.end method

.method public I()V
    .locals 2

    iget-object v0, p0, Lo/f;->g0:Lp/e;

    const/4 v1, 0x1

    .line 1
    iput-boolean v1, v0, Lp/e;->b:Z

    return-void
.end method

.method public J(I)V
    .locals 1

    iput p1, p0, Lo/f;->q0:I

    const/16 v0, 0x100

    invoke-static {p1, v0}, Lo/j;->a(II)Z

    move-result p1

    sput-boolean p1, Ln/d;->p:Z

    return-void
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, Lo/f;->j0:Ln/d;

    invoke-virtual {v0}, Ln/d;->t()V

    const/4 v0, 0x0

    iput v0, p0, Lo/f;->k0:I

    iput v0, p0, Lo/f;->l0:I

    invoke-super {p0}, Lo/l;->u()V

    return-void
.end method
