.class public abstract Landroidx/recyclerview/widget/k$v;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "v"
.end annotation


# static fields
.field public static final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:I

.field public c:J

.field public d:I

.field public e:Landroidx/recyclerview/widget/k$v;

.field public f:I

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:Landroidx/recyclerview/widget/k$p;

.field public k:Z

.field public l:I

.field public m:I

.field public n:Landroidx/recyclerview/widget/k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/k$v;->o:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    const/16 v0, 0x400

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k$v;->b(I)V

    goto :goto_0

    :cond_0
    iget v1, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/2addr v0, v1

    if-nez v0, :cond_2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k$v;->g:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/k$v;->g:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/k$v;->h:Ljava/util/List;

    .line 2
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/k$v;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/k$v;->f:I

    return-void
.end method

.method public c()V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    return-void
.end method

.method public final d()I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->a:I

    :cond_0
    return v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit16 v0, v0, 0x400

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/k$v;->g:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/k$v;->h:Ljava/util/List;

    return-object v0

    :cond_1
    :goto_0
    sget-object v0, Landroidx/recyclerview/widget/k$v;->o:Ljava/util/List;

    return-object v0

    :cond_2
    sget-object v0, Landroidx/recyclerview/widget/k$v;->o:Ljava/util/List;

    return-object v0
.end method

.method public f(I)Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g()Z
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public h()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/k$v;->j:Landroidx/recyclerview/widget/k$p;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    const/4 v1, -0x1

    iput v1, p0, Landroidx/recyclerview/widget/k$v;->a:I

    iput v1, p0, Landroidx/recyclerview/widget/k$v;->b:I

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Landroidx/recyclerview/widget/k$v;->c:J

    iput v1, p0, Landroidx/recyclerview/widget/k$v;->d:I

    iput v0, p0, Landroidx/recyclerview/widget/k$v;->i:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/recyclerview/widget/k$v;->e:Landroidx/recyclerview/widget/k$v;

    .line 1
    iget-object v2, p0, Landroidx/recyclerview/widget/k$v;->g:Ljava/util/List;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->clear()V

    :cond_0
    iget v2, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, Landroidx/recyclerview/widget/k$v;->f:I

    .line 2
    iput v0, p0, Landroidx/recyclerview/widget/k$v;->l:I

    iput v1, p0, Landroidx/recyclerview/widget/k$v;->m:I

    sget-object v0, Landroidx/recyclerview/widget/k;->s0:[I

    return-void
.end method

.method public n(II)V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    not-int v1, p2

    and-int/2addr v0, v1

    and-int/2addr p1, p2

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/k$v;->f:I

    return-void
.end method

.method public final o(Z)V
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Landroidx/recyclerview/widget/k$v;->i:I

    if-eqz p1, :cond_0

    sub-int/2addr v1, v0

    goto :goto_0

    :cond_0
    add-int/2addr v1, v0

    :goto_0
    iput v1, p0, Landroidx/recyclerview/widget/k$v;->i:I

    if-gez v1, :cond_1

    const/4 p1, 0x0

    iput p1, p0, Landroidx/recyclerview/widget/k$v;->i:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "View"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_1
    if-nez p1, :cond_2

    if-ne v1, v0, :cond_2

    iget p1, p0, Landroidx/recyclerview/widget/k$v;->f:I

    or-int/lit8 p1, p1, 0x10

    :goto_1
    iput p1, p0, Landroidx/recyclerview/widget/k$v;->f:I

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    if-nez v1, :cond_3

    iget p1, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 p1, p1, -0x11

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public p()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ViewHolder{"

    invoke-static {v1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " position="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/k$v;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Landroidx/recyclerview/widget/k$v;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", oldPos="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/k$v;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", pLpos:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/k$v;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/k$v;->f:I

    and-int/lit8 v0, v0, 0x10

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    throw v1

    .line 3
    :cond_0
    sget-object v0, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 4
    throw v1
.end method
