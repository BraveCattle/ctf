.class public Landroidx/fragment/app/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/i$a;
    }
.end annotation


# static fields
.field public static final a:[I

.field public static final b:Lk0/o;

.field public static final c:Lk0/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Landroidx/fragment/app/i;->a:[I

    new-instance v0, Lk0/k;

    invoke-direct {v0}, Lk0/k;-><init>()V

    sput-object v0, Landroidx/fragment/app/i;->b:Lk0/o;

    .line 1
    :try_start_0
    const-class v0, Lr0/d;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/o;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    sput-object v0, Landroidx/fragment/app/i;->c:Lk0/o;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3
        0x0
        0x1
        0x5
        0x4
        0x7
        0x6
        0x9
        0x8
        0xa
    .end array-data
.end method

.method public static a(Ljava/util/ArrayList;Ll/a;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ll/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget v0, p1, Ll/h;->c:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 2
    invoke-virtual {p1, v0}, Ll/h;->k(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    sget-object v2, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 3
    invoke-virtual {v1}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-interface {p2, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static b(Landroidx/fragment/app/a;Landroidx/fragment/app/f$a;Landroid/util/SparseArray;ZZ)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/a;",
            "Landroidx/fragment/app/f$a;",
            "Landroid/util/SparseArray<",
            "Landroidx/fragment/app/i$a;",
            ">;ZZ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    iget-object v10, v1, Landroidx/fragment/app/f$a;->b:Landroidx/fragment/app/Fragment;

    if-nez v10, :cond_0

    return-void

    :cond_0
    iget v11, v10, Landroidx/fragment/app/Fragment;->w:I

    if-nez v11, :cond_1

    return-void

    :cond_1
    if-eqz v3, :cond_2

    sget-object v4, Landroidx/fragment/app/i;->a:[I

    iget v1, v1, Landroidx/fragment/app/f$a;->a:I

    aget v1, v4, v1

    goto :goto_0

    :cond_2
    iget v1, v1, Landroidx/fragment/app/f$a;->a:I

    :goto_0
    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v5, :cond_a

    const/4 v6, 0x3

    if-eq v1, v6, :cond_7

    const/4 v6, 0x4

    if-eq v1, v6, :cond_5

    const/4 v6, 0x5

    if-eq v1, v6, :cond_3

    const/4 v6, 0x6

    if-eq v1, v6, :cond_7

    const/4 v6, 0x7

    if-eq v1, v6, :cond_a

    move v1, v4

    move v12, v1

    move v13, v12

    goto/16 :goto_6

    :cond_3
    if-eqz p4, :cond_4

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->J:Z

    if-eqz v1, :cond_c

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->y:Z

    if-nez v1, :cond_c

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->k:Z

    if-eqz v1, :cond_c

    goto :goto_4

    :cond_4
    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->y:Z

    goto :goto_5

    :cond_5
    if-eqz p4, :cond_6

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->J:Z

    if-eqz v1, :cond_9

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->k:Z

    if-eqz v1, :cond_9

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->y:Z

    if-eqz v1, :cond_9

    goto :goto_1

    :cond_6
    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->k:Z

    if-eqz v1, :cond_9

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->y:Z

    if-nez v1, :cond_9

    goto :goto_1

    :cond_7
    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->k:Z

    if-eqz p4, :cond_8

    goto :goto_2

    :cond_8
    if-eqz v1, :cond_9

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->y:Z

    if-nez v1, :cond_9

    :goto_1
    move v1, v5

    goto :goto_3

    :cond_9
    :goto_2
    move v1, v4

    :goto_3
    move v13, v1

    move v1, v4

    move v12, v5

    goto :goto_6

    :cond_a
    if-eqz p4, :cond_b

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->I:Z

    goto :goto_5

    :cond_b
    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->k:Z

    if-nez v1, :cond_c

    iget-boolean v1, v10, Landroidx/fragment/app/Fragment;->y:Z

    if-nez v1, :cond_c

    :goto_4
    move v1, v5

    goto :goto_5

    :cond_c
    move v1, v4

    :goto_5
    move v12, v4

    move v13, v12

    move v4, v1

    move v1, v5

    :goto_6
    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/i$a;

    if-eqz v4, :cond_e

    if-nez v6, :cond_d

    .line 1
    new-instance v4, Landroidx/fragment/app/i$a;

    invoke-direct {v4}, Landroidx/fragment/app/i$a;-><init>()V

    invoke-virtual {v2, v11, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object v6, v4

    .line 2
    :cond_d
    iput-object v10, v6, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    iput-boolean v3, v6, Landroidx/fragment/app/i$a;->b:Z

    iput-object v0, v6, Landroidx/fragment/app/i$a;->c:Landroidx/fragment/app/a;

    :cond_e
    move-object v14, v6

    const/4 v15, 0x0

    if-nez p4, :cond_10

    if-eqz v1, :cond_10

    if-eqz v14, :cond_f

    iget-object v1, v14, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    if-ne v1, v10, :cond_f

    iput-object v15, v14, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    :cond_f
    iget-object v4, v0, Landroidx/fragment/app/a;->q:Landroidx/fragment/app/e;

    iget v1, v10, Landroidx/fragment/app/Fragment;->b:I

    if-ge v1, v5, :cond_10

    iget v1, v4, Landroidx/fragment/app/e;->o:I

    if-lt v1, v5, :cond_10

    iget-boolean v1, v0, Landroidx/fragment/app/f;->p:Z

    if-nez v1, :cond_10

    invoke-virtual {v4, v10}, Landroidx/fragment/app/e;->T(Landroidx/fragment/app/Fragment;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v10

    invoke-virtual/range {v4 .. v9}, Landroidx/fragment/app/e;->W(Landroidx/fragment/app/Fragment;IIIZ)V

    :cond_10
    if-eqz v13, :cond_13

    if-eqz v14, :cond_11

    iget-object v1, v14, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    if-nez v1, :cond_13

    :cond_11
    if-nez v14, :cond_12

    .line 3
    new-instance v1, Landroidx/fragment/app/i$a;

    invoke-direct {v1}, Landroidx/fragment/app/i$a;-><init>()V

    invoke-virtual {v2, v11, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object v14, v1

    .line 4
    :cond_12
    iput-object v10, v14, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    iput-boolean v3, v14, Landroidx/fragment/app/i$a;->e:Z

    iput-object v0, v14, Landroidx/fragment/app/i$a;->f:Landroidx/fragment/app/a;

    :cond_13
    if-nez p4, :cond_14

    if-eqz v12, :cond_14

    if-eqz v14, :cond_14

    iget-object v0, v14, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    if-ne v0, v10, :cond_14

    iput-object v15, v14, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    :cond_14
    return-void
.end method

.method public static c(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLl/a;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Landroidx/fragment/app/Fragment;",
            "Z",
            "Ll/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->k()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->k()V

    :goto_0
    return-void
.end method

.method public static d(Lk0/o;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk0/o;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Lk0/o;->e(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static e(Lk0/o;Ll/a;Ljava/lang/Object;Landroidx/fragment/app/i$a;)Ll/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk0/o;",
            "Ll/a<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Landroidx/fragment/app/i$a;",
            ")",
            "Ll/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object p0, p3, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p1}, Ll/h;->isEmpty()Z

    move-result p0

    invoke-virtual {p1}, Ll/h;->clear()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static f(Lk0/o;Ll/a;Ljava/lang/Object;Landroidx/fragment/app/i$a;)Ll/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk0/o;",
            "Ll/a<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Landroidx/fragment/app/i$a;",
            ")",
            "Ll/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ll/h;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iget-object p2, p3, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    new-instance v0, Ll/a;

    invoke-direct {v0}, Ll/a;-><init>()V

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->B()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lk0/o;->h(Ljava/util/Map;Landroid/view/View;)V

    iget-object p0, p3, Landroidx/fragment/app/i$a;->f:Landroidx/fragment/app/a;

    iget-boolean p3, p3, Landroidx/fragment/app/i$a;->e:Z

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->k()V

    iget-object p0, p0, Landroidx/fragment/app/f;->o:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    iget-object p0, p0, Landroidx/fragment/app/f;->n:Ljava/util/ArrayList;

    .line 1
    :goto_0
    invoke-static {v0, p0}, Ll/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 2
    invoke-virtual {v0}, Ll/a;->keySet()Ljava/util/Set;

    move-result-object p0

    .line 3
    invoke-static {p1, p0}, Ll/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    return-object v0

    .line 4
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ll/h;->clear()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static g(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)Lk0/o;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->l()Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->s()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->j()Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->r()Ljava/lang/Object;

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    sget-object p0, Landroidx/fragment/app/i;->b:Lk0/o;

    invoke-static {p0, v0}, Landroidx/fragment/app/i;->d(Lk0/o;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_5

    return-object p0

    :cond_5
    sget-object p0, Landroidx/fragment/app/i;->c:Lk0/o;

    if-eqz p0, :cond_6

    invoke-static {p0, v0}, Landroidx/fragment/app/i;->d(Lk0/o;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_6

    return-object p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid Transition types"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static h(Lk0/o;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk0/o;",
            "Ljava/lang/Object;",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    .line 2
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, v0}, Lk0/o;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static i(Lk0/o;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->j()Ljava/lang/Object;

    :goto_0
    invoke-virtual {p0, v0}, Lk0/o;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lk0/o;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->q()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->l()Ljava/lang/Object;

    :goto_0
    invoke-virtual {p0, v0}, Lk0/o;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ll/a;Landroidx/fragment/app/i$a;Ljava/lang/Object;Z)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Landroidx/fragment/app/i$a;",
            "Ljava/lang/Object;",
            "Z)",
            "Landroid/view/View;"
        }
    .end annotation

    iget-object p1, p1, Landroidx/fragment/app/i$a;->c:Landroidx/fragment/app/a;

    if-eqz p2, :cond_1

    if-eqz p0, :cond_1

    iget-object p2, p1, Landroidx/fragment/app/f;->n:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    if-eqz p3, :cond_0

    iget-object p1, p1, Landroidx/fragment/app/f;->n:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/f;->o:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l(Lk0/o;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    .locals 0

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->s()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->r()Ljava/lang/Object;

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lk0/o;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk0/o;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lk0/o;Ljava/lang/Object;Ljava/lang/Object;Ll/a;ZLandroidx/fragment/app/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk0/o;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ll/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;Z",
            "Landroidx/fragment/app/a;",
            ")V"
        }
    .end annotation

    iget-object v0, p5, Landroidx/fragment/app/f;->n:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    iget-object p4, p5, Landroidx/fragment/app/f;->o:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    iget-object p4, p5, Landroidx/fragment/app/f;->n:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p3, p4}, Ll/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    invoke-virtual {p0, p1, p3}, Lk0/o;->q(Ljava/lang/Object;Landroid/view/View;)V

    if-eqz p2, :cond_1

    invoke-virtual {p0, p2, p3}, Lk0/o;->q(Ljava/lang/Object;Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public static n(Ljava/util/ArrayList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static o(Landroidx/fragment/app/e;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/e;",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;IIZ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move/from16 v4, p5

    iget v5, v0, Landroidx/fragment/app/e;->o:I

    const/4 v6, 0x1

    if-ge v5, v6, :cond_0

    return-void

    :cond_0
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    move/from16 v7, p3

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v3, :cond_4

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/a;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 1
    iget-object v8, v9, Landroidx/fragment/app/a;->q:Landroidx/fragment/app/e;

    iget-object v8, v8, Landroidx/fragment/app/e;->q:Lk0/c;

    invoke-virtual {v8}, Lk0/c;->f()Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    iget-object v8, v9, Landroidx/fragment/app/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v6

    :goto_1
    if-ltz v8, :cond_3

    iget-object v10, v9, Landroidx/fragment/app/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/f$a;

    invoke-static {v9, v10, v5, v6, v4}, Landroidx/fragment/app/i;->b(Landroidx/fragment/app/a;Landroidx/fragment/app/f$a;Landroid/util/SparseArray;ZZ)V

    add-int/lit8 v8, v8, -0x1

    goto :goto_1

    .line 2
    :cond_2
    iget-object v10, v9, Landroidx/fragment/app/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    move v11, v8

    :goto_2
    if-ge v11, v10, :cond_3

    iget-object v12, v9, Landroidx/fragment/app/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/fragment/app/f$a;

    invoke-static {v9, v12, v5, v8, v4}, Landroidx/fragment/app/i;->b(Landroidx/fragment/app/a;Landroidx/fragment/app/f$a;Landroid/util/SparseArray;ZZ)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 3
    :cond_4
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-eqz v7, :cond_2b

    new-instance v7, Landroid/view/View;

    iget-object v9, v0, Landroidx/fragment/app/e;->p:Lk0/e;

    .line 4
    iget-object v9, v9, Lk0/e;->c:Landroid/content/Context;

    .line 5
    invoke-direct {v7, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v15

    move v14, v8

    :goto_4
    if-ge v14, v15, :cond_2b

    invoke-virtual {v5, v14}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v9

    .line 6
    new-instance v13, Ll/a;

    invoke-direct {v13}, Ll/a;-><init>()V

    add-int/lit8 v10, v3, -0x1

    move/from16 v12, p3

    :goto_5
    if-lt v10, v12, :cond_9

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/a;

    invoke-virtual {v11, v9}, Landroidx/fragment/app/a;->e(I)Z

    move-result v16

    if-nez v16, :cond_5

    goto :goto_9

    :cond_5
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Boolean;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    iget-object v6, v11, Landroidx/fragment/app/f;->n:Ljava/util/ArrayList;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    iget-object v8, v11, Landroidx/fragment/app/f;->n:Ljava/util/ArrayList;

    iget-object v11, v11, Landroidx/fragment/app/f;->o:Ljava/util/ArrayList;

    if-eqz v16, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v37, v11

    move-object v11, v8

    move-object/from16 v8, v37

    :goto_6
    const/4 v1, 0x0

    :goto_7
    if-ge v1, v6, :cond_8

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v2, v16

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v13, v3}, Ll/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move/from16 v17, v6

    move-object/from16 v6, v16

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_7

    invoke-virtual {v13, v2, v6}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_7
    invoke-virtual {v13, v2, v3}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move/from16 v6, v17

    goto :goto_7

    :cond_8
    :goto_9
    add-int/lit8 v10, v10, -0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const/4 v6, 0x1

    const/4 v8, 0x0

    goto :goto_5

    .line 7
    :cond_9
    invoke-virtual {v5, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/i$a;

    if-eqz v4, :cond_1c

    .line 8
    iget-object v3, v0, Landroidx/fragment/app/e;->q:Lk0/c;

    invoke-virtual {v3}, Lk0/c;->f()Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v0, Landroidx/fragment/app/e;->q:Lk0/c;

    invoke-virtual {v3, v9}, Lk0/c;->e(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    goto :goto_a

    :cond_a
    const/4 v3, 0x0

    :goto_a
    if-nez v3, :cond_b

    goto :goto_b

    :cond_b
    iget-object v6, v1, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    iget-object v8, v1, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    invoke-static {v8, v6}, Landroidx/fragment/app/i;->g(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)Lk0/o;

    move-result-object v9

    if-nez v9, :cond_d

    :goto_b
    move-object/from16 v31, v5

    move/from16 v16, v14

    move/from16 v17, v15

    :cond_c
    :goto_c
    const/4 v3, 0x0

    goto/16 :goto_15

    :cond_d
    iget-boolean v10, v1, Landroidx/fragment/app/i$a;->b:Z

    iget-boolean v11, v1, Landroidx/fragment/app/i$a;->e:Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v9, v6, v10}, Landroidx/fragment/app/i;->i(Lk0/o;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9, v8, v11}, Landroidx/fragment/app/i;->j(Lk0/o;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v31, v5

    .line 9
    iget-object v5, v1, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    iget-object v12, v1, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    move/from16 v16, v14

    if-eqz v5, :cond_e

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->B()Landroid/view/View;

    move-result-object v14

    move/from16 v17, v15

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Landroid/view/View;->setVisibility(I)V

    goto :goto_d

    :cond_e
    move/from16 v17, v15

    :goto_d
    if-eqz v5, :cond_14

    if-nez v12, :cond_f

    goto :goto_f

    :cond_f
    iget-boolean v14, v1, Landroidx/fragment/app/i$a;->b:Z

    invoke-virtual {v13}, Ll/h;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_10

    const/4 v15, 0x0

    goto :goto_e

    :cond_10
    invoke-static {v9, v5, v12, v14}, Landroidx/fragment/app/i;->l(Lk0/o;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v15

    :goto_e
    invoke-static {v9, v13, v15, v1}, Landroidx/fragment/app/i;->f(Lk0/o;Ll/a;Ljava/lang/Object;Landroidx/fragment/app/i$a;)Ll/a;

    move-result-object v15

    .line 10
    iget-object v1, v1, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    .line 11
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    invoke-virtual {v13}, Ll/h;->clear()V

    .line 13
    invoke-virtual {v13}, Ll/h;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_13

    if-eqz v15, :cond_11

    invoke-virtual {v15}, Ll/h;->clear()V

    :cond_11
    if-nez v10, :cond_12

    if-nez v11, :cond_12

    goto :goto_f

    :cond_12
    const/4 v1, 0x1

    invoke-static {v5, v12, v14, v15, v1}, Landroidx/fragment/app/i;->c(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLl/a;Z)V

    const/16 v28, 0x0

    const/16 v30, 0x0

    new-instance v1, Landroidx/fragment/app/g;

    const/16 v27, 0x0

    move-object/from16 v23, v1

    move-object/from16 v24, v5

    move-object/from16 v25, v12

    move/from16 v26, v14

    move-object/from16 v29, v9

    invoke-direct/range {v23 .. v30}, Landroidx/fragment/app/g;-><init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLl/a;Landroid/view/View;Lk0/o;Landroid/graphics/Rect;)V

    invoke-static {v3, v1}, Le0/l;->a(Landroid/view/View;Ljava/lang/Runnable;)Le0/l;

    goto :goto_f

    :cond_13
    invoke-virtual {v13}, Ll/a;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v4, v15, v0}, Landroidx/fragment/app/i;->a(Ljava/util/ArrayList;Ll/a;Ljava/util/Collection;)V

    invoke-virtual {v13}, Ll/a;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Landroidx/fragment/app/i;->a(Ljava/util/ArrayList;Ll/a;Ljava/util/Collection;)V

    throw v1

    :cond_14
    :goto_f
    if-nez v10, :cond_15

    if-nez v11, :cond_15

    goto/16 :goto_c

    .line 14
    :cond_15
    invoke-static {v9, v11, v8, v4, v7}, Landroidx/fragment/app/i;->h(Lk0/o;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v9, v10, v6, v2, v7}, Landroidx/fragment/app/i;->h(Lk0/o;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v5

    const/4 v6, 0x4

    invoke-static {v5, v6}, Landroidx/fragment/app/i;->n(Ljava/util/ArrayList;I)V

    const/4 v6, 0x0

    .line 15
    invoke-virtual {v9, v11, v10, v6}, Lk0/o;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_c

    if-eqz v8, :cond_16

    if-eqz v11, :cond_16

    .line 16
    iget-boolean v14, v8, Landroidx/fragment/app/Fragment;->k:Z

    if-eqz v14, :cond_16

    iget-boolean v14, v8, Landroidx/fragment/app/Fragment;->y:Z

    if-eqz v14, :cond_16

    iget-boolean v14, v8, Landroidx/fragment/app/Fragment;->J:Z

    if-eqz v14, :cond_16

    const/4 v14, 0x1

    invoke-virtual {v8, v14}, Landroidx/fragment/app/Fragment;->F(Z)V

    invoke-virtual {v9, v11, v6, v1}, Lk0/o;->n(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    iget-object v6, v8, Landroidx/fragment/app/Fragment;->D:Landroid/view/ViewGroup;

    new-instance v8, Lk0/i;

    invoke-direct {v8, v1}, Lk0/i;-><init>(Ljava/util/ArrayList;)V

    invoke-static {v6, v8}, Le0/l;->a(Landroid/view/View;Ljava/lang/Runnable;)Le0/l;

    .line 17
    :cond_16
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v15, 0x0

    :goto_10
    if-ge v15, v8, :cond_17

    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    sget-object v18, Le0/m;->a:Ljava/util/WeakHashMap;

    move/from16 v18, v8

    .line 18
    invoke-virtual {v14}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object v8

    .line 19
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x0

    .line 20
    invoke-virtual {v14, v8}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    add-int/lit8 v15, v15, 0x1

    move/from16 v8, v18

    goto :goto_10

    :cond_17
    const/4 v8, 0x0

    move-object/from16 v23, v9

    move-object/from16 v24, v12

    move-object/from16 v25, v10

    move-object/from16 v26, v5

    move-object/from16 v27, v11

    move-object/from16 v28, v1

    move-object/from16 v29, v8

    move-object/from16 v30, v2

    .line 21
    invoke-virtual/range {v23 .. v30}, Lk0/o;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    invoke-virtual {v9, v3, v12}, Lk0/o;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 22
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v15, 0x0

    :goto_11
    if-ge v15, v1, :cond_1b

    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    sget-object v11, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 23
    invoke-virtual {v10}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object v11

    .line 24
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v11, :cond_18

    goto :goto_13

    :cond_18
    const/4 v12, 0x0

    .line 25
    invoke-virtual {v10, v12}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v13, v11, v12}, Ll/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .line 27
    check-cast v10, Ljava/lang/String;

    const/4 v12, 0x0

    :goto_12
    if-ge v12, v1, :cond_1a

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_19

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    .line 28
    invoke-virtual {v10, v11}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    goto :goto_13

    :cond_19
    add-int/lit8 v12, v12, 0x1

    goto :goto_12

    :cond_1a
    :goto_13
    add-int/lit8 v15, v15, 0x1

    goto :goto_11

    .line 29
    :cond_1b
    new-instance v10, Lk0/l;

    move-object/from16 v23, v10

    move-object/from16 v24, v9

    move/from16 v25, v1

    move-object/from16 v26, v2

    move-object/from16 v27, v6

    move-object/from16 v28, v4

    move-object/from16 v29, v8

    invoke-direct/range {v23 .. v29}, Lk0/l;-><init>(Lk0/o;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-static {v3, v10}, Le0/l;->a(Landroid/view/View;Ljava/lang/Runnable;)Le0/l;

    const/4 v3, 0x0

    .line 30
    invoke-static {v5, v3}, Landroidx/fragment/app/i;->n(Ljava/util/ArrayList;I)V

    const/4 v5, 0x0

    invoke-virtual {v9, v5, v4, v2}, Lk0/o;->s(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_15

    :cond_1c
    move-object/from16 v31, v5

    move/from16 v16, v14

    move/from16 v17, v15

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 31
    iget-object v2, v0, Landroidx/fragment/app/e;->q:Lk0/c;

    invoke-virtual {v2}, Lk0/c;->f()Z

    move-result v2

    if-eqz v2, :cond_1d

    iget-object v2, v0, Landroidx/fragment/app/e;->q:Lk0/c;

    invoke-virtual {v2, v9}, Lk0/c;->e(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_14

    :cond_1d
    move-object v2, v5

    :goto_14
    if-nez v2, :cond_1e

    goto :goto_15

    :cond_1e
    iget-object v4, v1, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    iget-object v6, v1, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    invoke-static {v6, v4}, Landroidx/fragment/app/i;->g(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)Lk0/o;

    move-result-object v8

    if-nez v8, :cond_1f

    :goto_15
    move/from16 v34, v16

    move/from16 v35, v17

    goto/16 :goto_1b

    :cond_1f
    iget-boolean v9, v1, Landroidx/fragment/app/i$a;->b:Z

    iget-boolean v10, v1, Landroidx/fragment/app/i$a;->e:Z

    invoke-static {v8, v4, v9}, Landroidx/fragment/app/i;->i(Lk0/o;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v8, v6, v10}, Landroidx/fragment/app/i;->j(Lk0/o;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v14

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 32
    iget-object v10, v1, Landroidx/fragment/app/i$a;->a:Landroidx/fragment/app/Fragment;

    iget-object v9, v1, Landroidx/fragment/app/i$a;->d:Landroidx/fragment/app/Fragment;

    if-eqz v10, :cond_26

    if-nez v9, :cond_20

    goto/16 :goto_19

    :cond_20
    iget-boolean v3, v1, Landroidx/fragment/app/i$a;->b:Z

    invoke-virtual {v13}, Ll/h;->isEmpty()Z

    move-result v18

    if-eqz v18, :cond_21

    goto :goto_16

    :cond_21
    invoke-static {v8, v10, v9, v3}, Landroidx/fragment/app/i;->l(Lk0/o;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v5, v18

    :goto_16
    invoke-static {v8, v13, v5, v1}, Landroidx/fragment/app/i;->f(Lk0/o;Ll/a;Ljava/lang/Object;Landroidx/fragment/app/i$a;)Ll/a;

    move-result-object v0

    invoke-virtual {v13}, Ll/h;->isEmpty()Z

    move-result v18

    if-eqz v18, :cond_22

    const/4 v5, 0x0

    goto :goto_17

    :cond_22
    move-object/from16 v18, v5

    invoke-virtual {v0}, Ll/a;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v5, v18

    :goto_17
    if-nez v15, :cond_23

    if-nez v14, :cond_23

    if-nez v5, :cond_23

    goto/16 :goto_19

    :cond_23
    move-object/from16 v32, v4

    const/4 v4, 0x1

    invoke-static {v10, v9, v3, v0, v4}, Landroidx/fragment/app/i;->c(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLl/a;Z)V

    if-eqz v5, :cond_25

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v8, v5, v7, v12}, Lk0/o;->r(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    move-object/from16 v18, v9

    iget-boolean v9, v1, Landroidx/fragment/app/i$a;->e:Z

    move-object/from16 v19, v10

    iget-object v10, v1, Landroidx/fragment/app/i$a;->f:Landroidx/fragment/app/a;

    move-object/from16 v22, v8

    move-object/from16 v23, v5

    move-object/from16 v24, v14

    move-object/from16 v25, v0

    move/from16 v26, v9

    move-object/from16 v27, v10

    invoke-static/range {v22 .. v27}, Landroidx/fragment/app/i;->m(Lk0/o;Ljava/lang/Object;Ljava/lang/Object;Ll/a;ZLandroidx/fragment/app/a;)V

    if-eqz v15, :cond_24

    invoke-virtual {v8, v15, v4}, Lk0/o;->p(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_24
    move-object/from16 v21, v4

    goto :goto_18

    :cond_25
    move-object/from16 v18, v9

    move-object/from16 v19, v10

    const/16 v21, 0x0

    :goto_18
    new-instance v0, Landroidx/fragment/app/h;

    move-object/from16 v4, v18

    move-object v9, v0

    move-object/from16 v18, v19

    move-object v10, v8

    move-object/from16 v33, v11

    move-object v11, v13

    move-object/from16 v22, v12

    move-object v12, v5

    move-object/from16 v23, v5

    move-object v5, v13

    move-object v13, v1

    move-object v1, v14

    move/from16 v34, v16

    move-object/from16 v14, v33

    move-object/from16 v36, v15

    move/from16 v35, v17

    move-object v15, v7

    move-object/from16 v16, v18

    move-object/from16 v17, v4

    move/from16 v18, v3

    move-object/from16 v19, v22

    move-object/from16 v20, v36

    invoke-direct/range {v9 .. v21}, Landroidx/fragment/app/h;-><init>(Lk0/o;Ll/a;Ljava/lang/Object;Landroidx/fragment/app/i$a;Ljava/util/ArrayList;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V

    invoke-static {v2, v0}, Le0/l;->a(Landroid/view/View;Ljava/lang/Runnable;)Le0/l;

    move-object/from16 v0, v23

    move-object/from16 v3, v36

    goto :goto_1a

    :cond_26
    :goto_19
    move-object/from16 v32, v4

    move-object/from16 v33, v11

    move-object/from16 v22, v12

    move-object v5, v13

    move-object v1, v14

    move-object/from16 v36, v15

    move/from16 v34, v16

    move/from16 v35, v17

    move-object/from16 v3, v36

    const/4 v0, 0x0

    :goto_1a
    if-nez v3, :cond_27

    if-nez v0, :cond_27

    if-nez v1, :cond_27

    goto :goto_1b

    :cond_27
    move-object/from16 v4, v22

    .line 33
    invoke-static {v8, v1, v6, v4, v7}, Landroidx/fragment/app/i;->h(Lk0/o;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v16

    if-eqz v16, :cond_28

    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_29

    :cond_28
    const/4 v1, 0x0

    :cond_29
    invoke-virtual {v8, v3, v7}, Lk0/o;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 34
    invoke-virtual {v8, v1, v3, v0}, Lk0/o;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2a

    .line 35
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v22, v8

    move-object/from16 v23, v4

    move-object/from16 v24, v3

    move-object/from16 v25, v15

    move-object/from16 v26, v1

    move-object/from16 v27, v16

    move-object/from16 v28, v0

    move-object/from16 v29, v33

    invoke-virtual/range {v22 .. v29}, Lk0/o;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 36
    new-instance v0, Lk0/j;

    move-object v9, v0

    move-object v10, v3

    move-object v11, v8

    move-object v12, v7

    move-object/from16 v13, v32

    move-object/from16 v14, v33

    move-object/from16 v17, v1

    invoke-direct/range {v9 .. v17}, Lk0/j;-><init>(Ljava/lang/Object;Lk0/o;Landroid/view/View;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V

    invoke-static {v2, v0}, Le0/l;->a(Landroid/view/View;Ljava/lang/Runnable;)Le0/l;

    .line 37
    new-instance v0, Lk0/m;

    move-object/from16 v1, v33

    invoke-direct {v0, v8, v1, v5}, Lk0/m;-><init>(Lk0/o;Ljava/util/ArrayList;Ljava/util/Map;)V

    invoke-static {v2, v0}, Le0/l;->a(Landroid/view/View;Ljava/lang/Runnable;)Le0/l;

    .line 38
    invoke-virtual {v8, v2, v4}, Lk0/o;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 39
    new-instance v0, Lk0/n;

    invoke-direct {v0, v8, v1, v5}, Lk0/n;-><init>(Lk0/o;Ljava/util/ArrayList;Ljava/util/Map;)V

    invoke-static {v2, v0}, Le0/l;->a(Landroid/view/View;Ljava/lang/Runnable;)Le0/l;

    :cond_2a
    :goto_1b
    add-int/lit8 v14, v34, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, v31

    move/from16 v15, v35

    const/4 v6, 0x1

    const/4 v8, 0x0

    goto/16 :goto_4

    :cond_2b
    return-void
.end method
