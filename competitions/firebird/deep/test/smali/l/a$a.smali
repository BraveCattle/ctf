.class public Ll/a$a;
.super Ll/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll/a;->l()Ll/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll/g<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic d:Ll/a;


# direct methods
.method public constructor <init>(Ll/a;)V
    .locals 0

    iput-object p1, p0, Ll/a$a;->d:Ll/a;

    invoke-direct {p0}, Ll/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    invoke-virtual {v0}, Ll/h;->clear()V

    return-void
.end method

.method public b(II)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    iget-object v0, v0, Ll/h;->b:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p1, v0, p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    iget v0, v0, Ll/h;->c:I

    return v0
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    invoke-virtual {v0, p1}, Ll/h;->e(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    invoke-virtual {v0, p1}, Ll/h;->g(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    invoke-virtual {v0, p1, p2}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    invoke-virtual {v0, p1}, Ll/h;->i(I)Ljava/lang/Object;

    return-void
.end method

.method public i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    iget-object v0, p0, Ll/a$a;->d:Ll/a;

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    .line 1
    iget-object v0, v0, Ll/h;->b:[Ljava/lang/Object;

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    return-object v1
.end method
