.class public abstract Lr0/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr0/g$c;,
        Lr0/g$b;,
        Lr0/g$d;
    }
.end annotation


# static fields
.field public static final u:[I

.field public static final v:Li/c;

.field public static w:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ll/a<",
            "Landroid/animation/Animator;",
            "Lr0/g$b;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:J

.field public d:Landroid/animation/TimeInterpolator;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ln/c;

.field public h:Ln/c;

.field public i:Lr0/m;

.field public j:[I

.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lr0/o;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lr0/o;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lr0/g$d;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lr0/g$c;

.field public t:Li/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lr0/g;->u:[I

    new-instance v0, Lr0/g$a;

    invoke-direct {v0}, Lr0/g$a;-><init>()V

    sput-object v0, Lr0/g;->v:Li/c;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lr0/g;->w:Ljava/lang/ThreadLocal;

    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x1
        0x3
        0x4
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lr0/g;->a:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lr0/g;->b:J

    iput-wide v0, p0, Lr0/g;->c:J

    const/4 v0, 0x0

    iput-object v0, p0, Lr0/g;->d:Landroid/animation/TimeInterpolator;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lr0/g;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lr0/g;->f:Ljava/util/ArrayList;

    new-instance v1, Ln/c;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ln/c;-><init>(I)V

    iput-object v1, p0, Lr0/g;->g:Ln/c;

    new-instance v1, Ln/c;

    invoke-direct {v1, v2}, Ln/c;-><init>(I)V

    iput-object v1, p0, Lr0/g;->h:Ln/c;

    iput-object v0, p0, Lr0/g;->i:Lr0/m;

    sget-object v1, Lr0/g;->u:[I

    iput-object v1, p0, Lr0/g;->j:[I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lr0/g;->m:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput v1, p0, Lr0/g;->n:I

    iput-boolean v1, p0, Lr0/g;->o:Z

    iput-boolean v1, p0, Lr0/g;->p:Z

    iput-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lr0/g;->r:Ljava/util/ArrayList;

    sget-object v0, Lr0/g;->v:Li/c;

    iput-object v0, p0, Lr0/g;->t:Li/c;

    return-void
.end method

.method public static c(Ln/c;Landroid/view/View;Lr0/o;)V
    .locals 6

    iget-object v0, p0, Ln/c;->a:Ljava/lang/Object;

    check-cast v0, Ll/a;

    invoke-virtual {v0, p1, p2}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x0

    if-ltz p2, :cond_1

    iget-object v1, p0, Ln/c;->b:Ljava/lang/Object;

    check-cast v1, Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v1, p0, Ln/c;->b:Ljava/lang/Object;

    check-cast v1, Landroid/util/SparseArray;

    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ln/c;->b:Ljava/lang/Object;

    check-cast v1, Landroid/util/SparseArray;

    invoke-virtual {v1, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    sget-object p2, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    .line 2
    iget-object v3, p0, Ln/c;->d:Ljava/lang/Object;

    check-cast v3, Ll/a;

    .line 3
    invoke-virtual {v3, p2}, Ll/h;->e(Ljava/lang/Object;)I

    move-result v3

    if-ltz v3, :cond_2

    move v3, v1

    goto :goto_1

    :cond_2
    move v3, v2

    :goto_1
    if-eqz v3, :cond_3

    .line 4
    iget-object v3, p0, Ln/c;->d:Ljava/lang/Object;

    check-cast v3, Ll/a;

    invoke-virtual {v3, p2, v0}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v3, p0, Ln/c;->d:Ljava/lang/Object;

    check-cast v3, Ll/a;

    invoke-virtual {v3, p2, p1}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/ListView;

    if-eqz p2, :cond_7

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v3

    invoke-interface {v3}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p2, p1}, Landroid/widget/ListView;->getPositionForView(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p2, v3}, Landroid/widget/ListView;->getItemIdAtPosition(I)J

    move-result-wide v3

    iget-object p2, p0, Ln/c;->c:Ljava/lang/Object;

    check-cast p2, Ll/e;

    .line 5
    iget-boolean v5, p2, Ll/e;->a:Z

    if-eqz v5, :cond_5

    invoke-virtual {p2}, Ll/e;->c()V

    :cond_5
    iget-object v5, p2, Ll/e;->b:[J

    iget p2, p2, Ll/e;->d:I

    invoke-static {v5, p2, v3, v4}, Ll/d;->b([JIJ)I

    move-result p2

    if-ltz p2, :cond_6

    .line 6
    iget-object p1, p0, Ln/c;->c:Ljava/lang/Object;

    check-cast p1, Ll/e;

    invoke-virtual {p1, v3, v4}, Ll/e;->d(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_7

    .line 7
    invoke-virtual {p1, v2}, Landroid/view/View;->setHasTransientState(Z)V

    .line 8
    iget-object p0, p0, Ln/c;->c:Ljava/lang/Object;

    check-cast p0, Ll/e;

    invoke-virtual {p0, v3, v4, v0}, Ll/e;->f(JLjava/lang/Object;)V

    goto :goto_3

    .line 9
    :cond_6
    invoke-virtual {p1, v1}, Landroid/view/View;->setHasTransientState(Z)V

    .line 10
    iget-object p0, p0, Ln/c;->c:Ljava/lang/Object;

    check-cast p0, Ll/e;

    invoke-virtual {p0, v3, v4, p1}, Ll/e;->f(JLjava/lang/Object;)V

    :cond_7
    :goto_3
    return-void
.end method

.method public static o()Ll/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll/a<",
            "Landroid/animation/Animator;",
            "Lr0/g$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lr0/g;->w:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/a;

    if-nez v0, :cond_0

    new-instance v0, Ll/a;

    invoke-direct {v0}, Ll/a;-><init>()V

    sget-object v1, Lr0/g;->w:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public static t(Lr0/o;Lr0/o;Ljava/lang/String;)Z
    .locals 0

    iget-object p0, p0, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p1, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p2, p0

    :cond_2
    :goto_0
    return p2
.end method


# virtual methods
.method public A(Lr0/g$c;)V
    .locals 0

    iput-object p1, p0, Lr0/g;->s:Lr0/g$c;

    return-void
.end method

.method public B(Landroid/animation/TimeInterpolator;)Lr0/g;
    .locals 0

    iput-object p1, p0, Lr0/g;->d:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method public C(Li/c;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lr0/g;->v:Li/c;

    :cond_0
    iput-object p1, p0, Lr0/g;->t:Li/c;

    return-void
.end method

.method public D(Lr0/l;)V
    .locals 0

    return-void
.end method

.method public E(J)Lr0/g;
    .locals 0

    iput-wide p1, p0, Lr0/g;->b:J

    return-object p0
.end method

.method public F()V
    .locals 5

    iget v0, p0, Lr0/g;->n:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr0/g$d;

    invoke-interface {v4, p0}, Lr0/g$d;->a(Lr0/g;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lr0/g;->p:Z

    :cond_1
    iget v0, p0, Lr0/g;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lr0/g;->n:I

    return-void
.end method

.method public G(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    invoke-static {p1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "@"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-wide v0, p0, Lr0/g;->c:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    const-string v1, ") "

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "dur("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lr0/g;->c:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iget-wide v4, p0, Lr0/g;->b:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "dly("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lr0/g;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Lr0/g;->d:Landroid/animation/TimeInterpolator;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "interp("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lr0/g;->d:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_2
    iget-object v0, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_3

    iget-object v0, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_8

    :cond_3
    const-string v0, "tgts("

    invoke-static {p1, v0}, Lf/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v1, ", "

    const/4 v2, 0x0

    if-lez v0, :cond_5

    move v0, v2

    :goto_0
    iget-object v3, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    if-lez v0, :cond_4

    invoke-static {p1, v1}, Lf/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_4
    invoke-static {p1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v3, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_7

    :goto_1
    iget-object v0, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    if-lez v2, :cond_6

    invoke-static {p1, v1}, Lf/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_6
    invoke-static {p1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    const-string v0, ")"

    invoke-static {p1, v0}, Lf/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_8
    return-object p1
.end method

.method public a(Lr0/g$d;)Lr0/g;
    .locals 1

    iget-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Landroid/view/View;)Lr0/g;
    .locals 1

    iget-object v0, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr0/g;->j()Lr0/g;

    move-result-object v0

    return-object v0
.end method

.method public abstract d(Lr0/o;)V
.end method

.method public final e(Landroid/view/View;Z)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    new-instance v0, Lr0/o;

    invoke-direct {v0}, Lr0/o;-><init>()V

    iput-object p1, v0, Lr0/o;->b:Landroid/view/View;

    if-eqz p2, :cond_1

    invoke-virtual {p0, v0}, Lr0/g;->g(Lr0/o;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lr0/g;->d(Lr0/o;)V

    :goto_0
    iget-object v1, v0, Lr0/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Lr0/g;->f(Lr0/o;)V

    if-eqz p2, :cond_2

    iget-object v1, p0, Lr0/g;->g:Ln/c;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lr0/g;->h:Ln/c;

    :goto_1
    invoke-static {v1, p1, v0}, Lr0/g;->c(Ln/c;Landroid/view/View;Lr0/o;)V

    :cond_3
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_4

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lr0/g;->e(Landroid/view/View;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public f(Lr0/o;)V
    .locals 0

    return-void
.end method

.method public abstract g(Lr0/o;)V
.end method

.method public h(Landroid/view/ViewGroup;Z)V
    .locals 5

    invoke-virtual {p0, p2}, Lr0/g;->i(Z)V

    iget-object v0, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    iget-object v0, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lr0/g;->e(Landroid/view/View;Z)V

    goto/16 :goto_7

    :cond_1
    :goto_0
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v2, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_5

    iget-object v2, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Lr0/o;

    invoke-direct {v3}, Lr0/o;-><init>()V

    iput-object v2, v3, Lr0/o;->b:Landroid/view/View;

    if-eqz p2, :cond_2

    invoke-virtual {p0, v3}, Lr0/g;->g(Lr0/o;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0, v3}, Lr0/g;->d(Lr0/o;)V

    :goto_2
    iget-object v4, v3, Lr0/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3}, Lr0/g;->f(Lr0/o;)V

    if-eqz p2, :cond_3

    iget-object v4, p0, Lr0/g;->g:Ln/c;

    goto :goto_3

    :cond_3
    iget-object v4, p0, Lr0/g;->h:Ln/c;

    :goto_3
    invoke-static {v4, v2, v3}, Lr0/g;->c(Ln/c;Landroid/view/View;Lr0/o;)V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    :goto_4
    iget-object p1, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_8

    iget-object p1, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    new-instance v1, Lr0/o;

    invoke-direct {v1}, Lr0/o;-><init>()V

    iput-object p1, v1, Lr0/o;->b:Landroid/view/View;

    if-eqz p2, :cond_6

    invoke-virtual {p0, v1}, Lr0/g;->g(Lr0/o;)V

    goto :goto_5

    :cond_6
    invoke-virtual {p0, v1}, Lr0/g;->d(Lr0/o;)V

    :goto_5
    iget-object v2, v1, Lr0/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1}, Lr0/g;->f(Lr0/o;)V

    if-eqz p2, :cond_7

    iget-object v2, p0, Lr0/g;->g:Ln/c;

    goto :goto_6

    :cond_7
    iget-object v2, p0, Lr0/g;->h:Ln/c;

    :goto_6
    invoke-static {v2, p1, v1}, Lr0/g;->c(Ln/c;Landroid/view/View;Lr0/o;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_8
    :goto_7
    return-void
.end method

.method public i(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lr0/g;->g:Ln/c;

    iget-object p1, p1, Ln/c;->a:Ljava/lang/Object;

    check-cast p1, Ll/a;

    invoke-virtual {p1}, Ll/h;->clear()V

    iget-object p1, p0, Lr0/g;->g:Ln/c;

    iget-object p1, p1, Ln/c;->b:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Lr0/g;->g:Ln/c;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lr0/g;->h:Ln/c;

    iget-object p1, p1, Ln/c;->a:Ljava/lang/Object;

    check-cast p1, Ll/a;

    invoke-virtual {p1}, Ll/h;->clear()V

    iget-object p1, p0, Lr0/g;->h:Ln/c;

    iget-object p1, p1, Ln/c;->b:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Lr0/g;->h:Ln/c;

    :goto_0
    iget-object p1, p1, Ln/c;->c:Ljava/lang/Object;

    check-cast p1, Ll/e;

    invoke-virtual {p1}, Ll/e;->a()V

    return-void
.end method

.method public j()Lr0/g;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr0/g;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Lr0/g;->r:Ljava/util/ArrayList;

    new-instance v2, Ln/c;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ln/c;-><init>(I)V

    iput-object v2, v1, Lr0/g;->g:Ln/c;

    new-instance v2, Ln/c;

    invoke-direct {v2, v3}, Ln/c;-><init>(I)V

    iput-object v2, v1, Lr0/g;->h:Ln/c;

    iput-object v0, v1, Lr0/g;->k:Ljava/util/ArrayList;

    iput-object v0, v1, Lr0/g;->l:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public k(Landroid/view/ViewGroup;Lr0/o;Lr0/o;)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Landroid/view/ViewGroup;Ln/c;Ln/c;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ln/c;",
            "Ln/c;",
            "Ljava/util/ArrayList<",
            "Lr0/o;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lr0/o;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    invoke-static {}, Lr0/g;->o()Ll/a;

    move-result-object v8

    new-instance v9, Landroid/util/SparseIntArray;

    invoke-direct {v9}, Landroid/util/SparseIntArray;-><init>()V

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v12, 0x0

    :goto_0
    const-wide v0, 0x7fffffffffffffffL

    if-ge v12, v10, :cond_c

    move-object/from16 v13, p4

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr0/o;

    move-object/from16 v14, p5

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr0/o;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v3, v0, Lr0/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    move-object v0, v2

    :cond_0
    if-eqz v1, :cond_1

    iget-object v3, v1, Lr0/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v1, v2

    :cond_1
    if-nez v0, :cond_3

    if-nez v1, :cond_3

    :cond_2
    move-object/from16 v15, p3

    move/from16 v17, v10

    goto/16 :goto_7

    :cond_3
    if-eqz v0, :cond_5

    if-eqz v1, :cond_5

    invoke-virtual {v6, v0, v1}, Lr0/g;->r(Lr0/o;Lr0/o;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v3, 0x1

    :goto_2
    if-eqz v3, :cond_2

    invoke-virtual {v6, v7, v0, v1}, Lr0/g;->k(Landroid/view/ViewGroup;Lr0/o;Lr0/o;)Landroid/animation/Animator;

    move-result-object v3

    if-eqz v3, :cond_2

    if-eqz v1, :cond_a

    iget-object v0, v1, Lr0/o;->b:Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Lr0/g;->p()[Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_9

    if-eqz v1, :cond_9

    array-length v4, v1

    if-lez v4, :cond_9

    new-instance v4, Lr0/o;

    invoke-direct {v4}, Lr0/o;-><init>()V

    iput-object v0, v4, Lr0/o;->b:Landroid/view/View;

    move-object/from16 v15, p3

    iget-object v5, v15, Ln/c;->a:Ljava/lang/Object;

    check-cast v5, Ll/a;

    .line 1
    invoke-virtual {v5, v0, v2}, Ll/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 2
    check-cast v5, Lr0/o;

    if-eqz v5, :cond_6

    const/4 v2, 0x0

    :goto_3
    array-length v11, v1

    if-ge v2, v11, :cond_6

    iget-object v11, v4, Lr0/o;->a:Ljava/util/Map;

    move-object/from16 v16, v3

    aget-object v3, v1, v2

    move/from16 v17, v10

    iget-object v10, v5, Lr0/o;->a:Ljava/util/Map;

    move-object/from16 v18, v5

    aget-object v5, v1, v2

    invoke-interface {v10, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v11, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v3, v16

    move/from16 v10, v17

    move-object/from16 v5, v18

    goto :goto_3

    :cond_6
    move-object/from16 v16, v3

    move/from16 v17, v10

    .line 3
    iget v1, v8, Ll/h;->c:I

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_8

    .line 4
    invoke-virtual {v8, v2}, Ll/h;->h(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-virtual {v8, v3}, Ll/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr0/g$b;

    iget-object v5, v3, Lr0/g$b;->c:Lr0/o;

    if-eqz v5, :cond_7

    iget-object v5, v3, Lr0/g$b;->a:Landroid/view/View;

    if-ne v5, v0, :cond_7

    iget-object v5, v3, Lr0/g$b;->b:Ljava/lang/String;

    .line 5
    iget-object v10, v6, Lr0/g;->a:Ljava/lang/String;

    .line 6
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v3, v3, Lr0/g$b;->c:Lr0/o;

    invoke-virtual {v3, v4}, Lr0/o;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v2, 0x0

    goto :goto_5

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_8
    move-object/from16 v2, v16

    goto :goto_5

    :cond_9
    move-object/from16 v15, p3

    move-object/from16 v16, v3

    move/from16 v17, v10

    move-object/from16 v2, v16

    const/4 v4, 0x0

    :goto_5
    move-object v1, v0

    move-object v10, v2

    move-object v5, v4

    goto :goto_6

    :cond_a
    move-object/from16 v15, p3

    move-object/from16 v16, v3

    move/from16 v17, v10

    iget-object v0, v0, Lr0/o;->b:Landroid/view/View;

    move-object v1, v0

    move-object/from16 v10, v16

    const/4 v5, 0x0

    :goto_6
    if-eqz v10, :cond_b

    new-instance v11, Lr0/g$b;

    .line 7
    iget-object v2, v6, Lr0/g;->a:Ljava/lang/String;

    .line 8
    sget-object v0, Lr0/r;->a:Lq/d;

    .line 9
    new-instance v4, Lr0/x;

    invoke-direct {v4, v7}, Lr0/x;-><init>(Landroid/view/View;)V

    move-object v0, v11

    move-object/from16 v3, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lr0/g$b;-><init>(Landroid/view/View;Ljava/lang/String;Lr0/g;Lr0/y;Lr0/o;)V

    invoke-virtual {v8, v10, v11}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v6, Lr0/g;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_7
    add-int/lit8 v12, v12, 0x1

    move/from16 v10, v17

    goto/16 :goto_0

    :cond_c
    const/4 v11, 0x0

    :goto_8
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-ge v11, v2, :cond_d

    invoke-virtual {v9, v11}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    iget-object v3, v6, Lr0/g;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v9, v11}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v3, v0

    invoke-virtual {v2}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v7

    add-long/2addr v7, v3

    invoke-virtual {v2, v7, v8}, Landroid/animation/Animator;->setStartDelay(J)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_d
    return-void
.end method

.method public m()V
    .locals 6

    iget v0, p0, Lr0/g;->n:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lr0/g;->n:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr0/g$d;

    invoke-interface {v5, p0}, Lr0/g$d;->b(Lr0/g;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_1
    iget-object v3, p0, Lr0/g;->g:Ln/c;

    iget-object v3, v3, Ln/c;->c:Ljava/lang/Object;

    check-cast v3, Ll/e;

    invoke-virtual {v3}, Ll/e;->g()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v3, p0, Lr0/g;->g:Ln/c;

    iget-object v3, v3, Ln/c;->c:Ljava/lang/Object;

    check-cast v3, Ll/e;

    invoke-virtual {v3, v0}, Ll/e;->h(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_1

    sget-object v4, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v0, v2

    .line 2
    :goto_2
    iget-object v3, p0, Lr0/g;->h:Ln/c;

    iget-object v3, v3, Ln/c;->c:Ljava/lang/Object;

    check-cast v3, Ll/e;

    invoke-virtual {v3}, Ll/e;->g()I

    move-result v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lr0/g;->h:Ln/c;

    iget-object v3, v3, Ln/c;->c:Ljava/lang/Object;

    check-cast v3, Ll/e;

    invoke-virtual {v3, v0}, Ll/e;->h(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_3

    sget-object v4, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 3
    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 4
    :cond_4
    iput-boolean v1, p0, Lr0/g;->p:Z

    :cond_5
    return-void
.end method

.method public n(Landroid/view/View;Z)Lr0/o;
    .locals 6

    iget-object v0, p0, Lr0/g;->i:Lr0/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lr0/g;->n(Landroid/view/View;Z)Lr0/o;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lr0/g;->k:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lr0/g;->l:Ljava/util/ArrayList;

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_5

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr0/o;

    if-nez v5, :cond_3

    return-object v1

    :cond_3
    iget-object v5, v5, Lr0/o;->b:Landroid/view/View;

    if-ne v5, p1, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-ltz v3, :cond_7

    if-eqz p2, :cond_6

    iget-object p1, p0, Lr0/g;->l:Ljava/util/ArrayList;

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lr0/g;->k:Ljava/util/ArrayList;

    :goto_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lr0/o;

    :cond_7
    return-object v1
.end method

.method public p()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public q(Landroid/view/View;Z)Lr0/o;
    .locals 1

    iget-object v0, p0, Lr0/g;->i:Lr0/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lr0/g;->q(Landroid/view/View;Z)Lr0/o;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lr0/g;->g:Ln/c;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lr0/g;->h:Ln/c;

    :goto_0
    iget-object p2, p2, Ln/c;->a:Ljava/lang/Object;

    check-cast p2, Ll/a;

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p2, p1, v0}, Ll/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    check-cast p1, Lr0/o;

    return-object p1
.end method

.method public r(Lr0/o;Lr0/o;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lr0/g;->p()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    array-length v3, v2

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    invoke-static {p1, p2, v5}, Lr0/g;->t(Lr0/o;Lr0/o;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p1, Lr0/o;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p1, p2, v3}, Lr0/g;->t(Lr0/o;Lr0/o;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    move v0, v1

    :cond_3
    return v0
.end method

.method public s(Landroid/view/View;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Lr0/g;->e:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, Lr0/g;->G(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroid/view/View;)V
    .locals 6

    iget-boolean v0, p0, Lr0/g;->p:Z

    if-nez v0, :cond_4

    invoke-static {}, Lr0/g;->o()Ll/a;

    move-result-object v0

    .line 1
    iget v1, v0, Ll/h;->c:I

    .line 2
    sget-object v2, Lr0/r;->a:Lq/d;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object p1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    const/4 v3, 0x0

    if-ltz v1, :cond_2

    .line 4
    invoke-virtual {v0, v1}, Ll/h;->k(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr0/g$b;

    iget-object v5, v4, Lr0/g$b;->a:Landroid/view/View;

    if-eqz v5, :cond_1

    iget-object v4, v4, Lr0/g$b;->d:Lr0/y;

    .line 5
    instance-of v5, v4, Lr0/x;

    if-eqz v5, :cond_0

    check-cast v4, Lr0/x;

    iget-object v4, v4, Lr0/x;->a:Landroid/view/WindowId;

    invoke-virtual {v4, p1}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v3, v2

    :cond_0
    if-eqz v3, :cond_1

    .line 6
    invoke-virtual {v0, v1}, Ll/h;->h(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    .line 7
    invoke-virtual {v3}, Landroid/animation/Animator;->pause()V

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lr0/g;->q:Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    iget-object p1, p0, Lr0/g;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_1
    if-ge v3, v0, :cond_3

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr0/g$d;

    invoke-interface {v1, p0}, Lr0/g$d;->c(Lr0/g;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iput-boolean v2, p0, Lr0/g;->o:Z

    :cond_4
    return-void
.end method

.method public v(Lr0/g$d;)Lr0/g;
    .locals 1

    iget-object v0, p0, Lr0/g;->q:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lr0/g;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lr0/g;->q:Ljava/util/ArrayList;

    :cond_1
    return-object p0
.end method

.method public w(Landroid/view/View;)Lr0/g;
    .locals 1

    iget-object v0, p0, Lr0/g;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public x(Landroid/view/View;)V
    .locals 6

    iget-boolean v0, p0, Lr0/g;->o:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lr0/g;->p:Z

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-static {}, Lr0/g;->o()Ll/a;

    move-result-object v0

    .line 1
    iget v2, v0, Ll/h;->c:I

    .line 2
    sget-object v3, Lr0/r;->a:Lq/d;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object p1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_0
    if-ltz v2, :cond_2

    .line 4
    invoke-virtual {v0, v2}, Ll/h;->k(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr0/g$b;

    iget-object v5, v4, Lr0/g$b;->a:Landroid/view/View;

    if-eqz v5, :cond_1

    iget-object v4, v4, Lr0/g$b;->d:Lr0/y;

    .line 5
    instance-of v5, v4, Lr0/x;

    if-eqz v5, :cond_0

    check-cast v4, Lr0/x;

    iget-object v4, v4, Lr0/x;->a:Landroid/view/WindowId;

    invoke-virtual {v4, p1}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v3

    goto :goto_1

    :cond_0
    move v4, v1

    :goto_1
    if-eqz v4, :cond_1

    .line 6
    invoke-virtual {v0, v2}, Ll/h;->h(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    .line 7
    invoke-virtual {v4}, Landroid/animation/Animator;->resume()V

    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lr0/g;->q:Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    iget-object p1, p0, Lr0/g;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v1

    :goto_2
    if-ge v2, v0, :cond_3

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr0/g$d;

    invoke-interface {v3, p0}, Lr0/g$d;->d(Lr0/g;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    iput-boolean v1, p0, Lr0/g;->o:Z

    :cond_4
    return-void
.end method

.method public y()V
    .locals 8

    invoke-virtual {p0}, Lr0/g;->F()V

    invoke-static {}, Lr0/g;->o()Ll/a;

    move-result-object v0

    iget-object v1, p0, Lr0/g;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v0, v2}, Ll/h;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lr0/g;->F()V

    if-eqz v2, :cond_0

    .line 1
    new-instance v3, Lr0/h;

    invoke-direct {v3, p0, v0}, Lr0/h;-><init>(Lr0/g;Ll/a;)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 2
    iget-wide v3, p0, Lr0/g;->c:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_1

    .line 3
    invoke-virtual {v2, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 4
    :cond_1
    iget-wide v3, p0, Lr0/g;->b:J

    cmp-long v5, v3, v5

    if-ltz v5, :cond_2

    .line 5
    invoke-virtual {v2, v3, v4}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 6
    :cond_2
    iget-object v3, p0, Lr0/g;->d:Landroid/animation/TimeInterpolator;

    if-eqz v3, :cond_3

    .line 7
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_3
    new-instance v3, Lr0/i;

    invoke-direct {v3, p0}, Lr0/i;-><init>(Lr0/g;)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v2}, Landroid/animation/Animator;->start()V

    goto :goto_0

    .line 8
    :cond_4
    iget-object v0, p0, Lr0/g;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lr0/g;->m()V

    return-void
.end method

.method public z(J)Lr0/g;
    .locals 0

    iput-wide p1, p0, Lr0/g;->c:J

    return-object p0
.end method
