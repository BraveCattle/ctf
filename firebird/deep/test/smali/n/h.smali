.class public Ln/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static m:I = 0x1


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:F

.field public f:Z

.field public g:[F

.field public h:[F

.field public i:I

.field public j:[Ln/b;

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ln/h;->b:I

    iput v0, p0, Ln/h;->c:I

    const/4 v0, 0x0

    iput v0, p0, Ln/h;->d:I

    iput-boolean v0, p0, Ln/h;->f:Z

    const/16 v1, 0x9

    new-array v2, v1, [F

    iput-object v2, p0, Ln/h;->g:[F

    new-array v1, v1, [F

    iput-object v1, p0, Ln/h;->h:[F

    const/16 v1, 0x10

    new-array v1, v1, [Ln/b;

    iput-object v1, p0, Ln/h;->j:[Ln/b;

    iput v0, p0, Ln/h;->k:I

    iput v0, p0, Ln/h;->l:I

    iput p1, p0, Ln/h;->i:I

    return-void
.end method


# virtual methods
.method public final a(Ln/b;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ln/h;->k:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ln/h;->j:[Ln/b;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ln/h;->j:[Ln/b;

    array-length v2, v0

    if-lt v1, v2, :cond_2

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln/b;

    iput-object v0, p0, Ln/h;->j:[Ln/b;

    :cond_2
    iget-object v0, p0, Ln/h;->j:[Ln/b;

    iget v1, p0, Ln/h;->k:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ln/h;->k:I

    return-void
.end method

.method public final b(Ln/b;)V
    .locals 4

    iget v0, p0, Ln/h;->k:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Ln/h;->j:[Ln/b;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-ge v1, p1, :cond_0

    iget-object p1, p0, Ln/h;->j:[Ln/b;

    add-int/lit8 v2, v1, 0x1

    aget-object v3, p1, v2

    aput-object v3, p1, v1

    move v1, v2

    goto :goto_1

    :cond_0
    iget p1, p0, Ln/h;->k:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ln/h;->k:I

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public c()V
    .locals 6

    const/4 v0, 0x5

    iput v0, p0, Ln/h;->i:I

    const/4 v0, 0x0

    iput v0, p0, Ln/h;->d:I

    const/4 v1, -0x1

    iput v1, p0, Ln/h;->b:I

    iput v1, p0, Ln/h;->c:I

    const/4 v1, 0x0

    iput v1, p0, Ln/h;->e:F

    iput-boolean v0, p0, Ln/h;->f:Z

    iget v2, p0, Ln/h;->k:I

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_0

    iget-object v4, p0, Ln/h;->j:[Ln/b;

    const/4 v5, 0x0

    aput-object v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Ln/h;->k:I

    iput v0, p0, Ln/h;->l:I

    iput-boolean v0, p0, Ln/h;->a:Z

    iget-object v0, p0, Ln/h;->h:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    return-void
.end method

.method public d(Ln/d;F)V
    .locals 2

    iput p2, p0, Ln/h;->e:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln/h;->f:Z

    iget p1, p0, Ln/h;->k:I

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Ln/h;->j:[Ln/b;

    aget-object v1, v1, v0

    invoke-virtual {v1, p0, p2}, Ln/b;->k(Ln/h;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput p2, p0, Ln/h;->k:I

    return-void
.end method

.method public final e(Ln/b;)V
    .locals 4

    iget v0, p0, Ln/h;->k:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Ln/h;->j:[Ln/b;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, v1}, Ln/b;->l(Ln/b;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, Ln/h;->k:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const-string v0, ""

    invoke-static {v0}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ln/h;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
